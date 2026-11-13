# Lab 8 Login Form

A JavaFX form exercise using labels, text fields, a password field and a button handler.

This is a toy interface exercise. Its current check uses only the username, despite the presence of a password field and sample password constant; it is not a complete authentication system.

## Source and structure

Original source and resources are under `src/`, with their contents and line endings preserved. Added files contain repository documentation, build instructions and ignore rules.

Source context: Java learning / Lab8; earlier local form draft.

## Build and run

The Windows build helper expects a Java 8 JDK distribution that includes JavaFX. The JavaFX runtime is not bundled with these sources.

```powershell
.\build.ps1 -JdkPath 'C:\path\to\jdk8'
java -jar build/project.jar
```

Default main class: `LoginForm`. Use `-MainClass` to select a different entry class when the exercise contains several programs.

## Verification

See [VALIDATION.md](VALIDATION.md) for compilation or syntax-check results. Application windows, interactive gameplay, accounts and network services were not run during this archival work. Existing coursework helpers and assets remain part of their original learning projects.

[Back to the Programming 2 project index](https://github.com/James-rate/programming-2/tree/main)
