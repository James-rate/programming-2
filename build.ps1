param(
    [string]$JdkPath = $env:JAVA_HOME,
    [string]$MainClass = 'LoginForm'
)
$ErrorActionPreference = 'Stop'
if ([string]::IsNullOrWhiteSpace($JdkPath)) {
    throw 'Pass -JdkPath pointing to a Java 8 JDK. JavaFX exercises require a JDK distribution that includes JavaFX.'
}
$compilerPath = Join-Path $JdkPath 'bin\javac.exe'
$jarToolPath = Join-Path $JdkPath 'bin\jar.exe'
foreach ($requiredPath in @($compilerPath, $jarToolPath)) {
    if (-not (Test-Path -LiteralPath $requiredPath -PathType Leaf)) { throw 'JDK compiler or JAR tool not found.' }
}
if (-not (Test-Path -LiteralPath (Join-Path $JdkPath 'jre\lib\ext\jfxrt.jar'))) { throw 'This exercise requires a JDK 8 distribution including JavaFX.' }
$sourceRoot = Join-Path $PSScriptRoot 'src'
$buildRoot = Join-Path $PSScriptRoot 'build'
$classesRoot = Join-Path $buildRoot 'classes'
$sourceListPath = Join-Path $buildRoot 'sources.txt'
$archivePath = Join-Path $buildRoot 'project.jar'
New-Item -ItemType Directory -Path $classesRoot -Force | Out-Null
$javaFiles = @(Get-ChildItem -LiteralPath $sourceRoot -Recurse -File -Filter '*.java' | Sort-Object FullName)
if ($javaFiles.Count -eq 0) { throw 'No Java sources found.' }
$sourceArguments = @($javaFiles | ForEach-Object { '"' + $_.FullName.Replace('\', '/') + '"' })
$utf8WithoutBom = New-Object System.Text.UTF8Encoding($false)
[System.IO.File]::WriteAllLines($sourceListPath, [string[]]$sourceArguments, $utf8WithoutBom)
& $compilerPath -encoding UTF-8 -d $classesRoot ('@' + $sourceListPath)
if ($LASTEXITCODE -ne 0) { throw 'Compilation failed. Original source files have not been changed.' }
Get-ChildItem -LiteralPath $sourceRoot -Recurse -File | Where-Object {
    $_.Extension.ToLowerInvariant() -in @('.fxml', '.css', '.png', '.jpg', '.jpeg', '.gif', '.properties', '.txt')
} | ForEach-Object {
    $relativePath = $_.FullName.Substring($sourceRoot.Length + 1)
    $destinationPath = Join-Path $classesRoot $relativePath
    New-Item -ItemType Directory -Path (Split-Path $destinationPath -Parent) -Force | Out-Null
    Copy-Item -LiteralPath $_.FullName -Destination $destinationPath -Force
}
& $jarToolPath cfe $archivePath $MainClass -C $classesRoot .
if ($LASTEXITCODE -ne 0) { throw 'JAR packaging failed.' }
Write-Output "Built $archivePath (main class: $MainClass)."
