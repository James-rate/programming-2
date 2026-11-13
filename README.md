# JavaFX Card Game

A local two-to-four-player card battle game with dealer and player windows.

The original JAR and its matching source are preserved. Fixed players Davey and Jenny can be joined by two optional players.

## Source and structure

Original source and resources are under `src/`, with their contents and line endings preserved. Added files contain repository documentation, build instructions and ignore rules.

Source context: Java learning / card game source; alternate local submission copy.

## Build and run

The Windows build helper expects a Java 8 JDK distribution that includes JavaFX. The JavaFX runtime is not bundled with these sources.

```powershell
.\build.ps1 -JdkPath 'C:\path\to\jdk8'
java -jar build/project.jar
```

Default main class: `App`. Use `-MainClass` to select a different entry class when the exercise contains several programs.

The original supplied JAR is preserved at [`artifacts/Assignment2.jar`](artifacts/Assignment2.jar). Run it with a Java 8 runtime that includes JavaFX. The more detailed original game guide is retained in [`docs/GAME_GUIDE.md`](docs/GAME_GUIDE.md).

## Verification

See [VALIDATION.md](VALIDATION.md) for compilation or syntax-check results. Application windows, interactive gameplay, accounts and network services were not run during this archival work. Existing coursework helpers and assets remain part of their original learning projects.

[Back to the Programming 2 project index](https://github.com/James-rate/programming-2/tree/main)
