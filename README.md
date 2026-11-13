# JavaFX Store

A multi-product JavaFX store exercise with a product list, product windows and sales.

The local modified implementation is used; the untouched starter ZIP is not a separate project branch.

## Source and structure

Original source and resources are under `src/`, with their contents and line endings preserved. Added files contain repository documentation, build instructions and ignore rules.

Source context: Java learning / Store.

## Build and run

The Windows build helper expects a Java 8 JDK distribution that includes JavaFX. The JavaFX runtime is not bundled with these sources.

```powershell
.\build.ps1 -JdkPath 'C:\path\to\jdk8'
java -jar build/project.jar
```

Default main class: `StoreApplication`. Use `-MainClass` to select a different entry class when the exercise contains several programs.

## Verification

See [VALIDATION.md](VALIDATION.md) for compilation or syntax-check results. Application windows, interactive gameplay, accounts and network services were not run during this archival work. Existing coursework helpers and assets remain part of their original learning projects.

[Back to the Programming 2 project index](https://github.com/James-rate/programming-2/tree/main)
