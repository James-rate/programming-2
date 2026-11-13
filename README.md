# Lab 8 Calculator

A JavaFX calculator exercise with a grid layout and arithmetic event handlers.

A separate incomplete local draft is retained in this branch history; the branch head uses the more complete Lab 8 implementation.

## Source and structure

Original source and resources are under `src/`, with their contents and line endings preserved. Added files contain repository documentation, build instructions and ignore rules.

Source context: Java learning / Lab8; earlier local calculator draft.

## Build and run

The Windows build helper expects a Java 8 JDK distribution that includes JavaFX. The JavaFX runtime is not bundled with these sources.

```powershell
.\build.ps1 -JdkPath 'C:\path\to\jdk8'
java -jar build/project.jar
```

Default main class: `Calculator`. Use `-MainClass` to select a different entry class when the exercise contains several programs.

## Verification

See [VALIDATION.md](VALIDATION.md) for compilation or syntax-check results. Application windows, interactive gameplay, accounts and network services were not run during this archival work. Existing coursework helpers and assets remain part of their original learning projects.

[Back to the Programming 2 project index](https://github.com/James-rate/programming-2/tree/main)
