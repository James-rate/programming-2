# Programming 2

A collection of local coursework projects and programming exercises. Each project has its own branch; `main` contains this index rather than a mixture of application files.

**11 project branches** are included. Three distinct student-edited local versions are also preserved in the history of their matching project branches. Original source files and resources are kept unchanged.

## Project branches

| Project | Branch | Type | Verification |
| --- | --- | --- | --- |
| JavaFX Card Game | [`codex/assignment-2-card-game`](https://github.com/James-rate/programming-2/tree/codex/assignment-2-card-game) | JavaFX desktop | Compiles with JDK 8 |
| Console Blackjack | [`codex/blackjack`](https://github.com/James-rate/programming-2/tree/codex/blackjack) | Java console | Compiles with JDK 8 |
| JavaFX Store | [`codex/javafx-store`](https://github.com/James-rate/programming-2/tree/codex/javafx-store) | JavaFX desktop | Compiles with JDK 8 |
| Lab 9 Store | [`codex/lab-9-store`](https://github.com/James-rate/programming-2/tree/codex/lab-9-store) | JavaFX desktop | Compiles with JDK 8 |
| Lab 8 Calculator | [`codex/lab-8-calculator`](https://github.com/James-rate/programming-2/tree/codex/lab-8-calculator) | JavaFX desktop | Compiles with JDK 8 |
| Lab 8 Login Form | [`codex/lab-8-login-form`](https://github.com/James-rate/programming-2/tree/codex/lab-8-login-form) | JavaFX desktop | Compiles with JDK 8 |
| JavaFX Hello World | [`codex/javafx-hello-world`](https://github.com/James-rate/programming-2/tree/codex/javafx-hello-world) | JavaFX desktop | Compiles with JDK 8 |
| Console Card Game Draft | [`codex/console-card-game-draft`](https://github.com/James-rate/programming-2/tree/codex/console-card-game-draft) | Java source draft | Incomplete: missing dependencies |
| Python Number to Words | [`codex/python-number-to-words`](https://github.com/James-rate/programming-2/tree/codex/python-number-to-words) | Python console | Python syntax checked |
| Module 0 Java Basics | [`codex/module-0-java-basics`](https://github.com/James-rate/programming-2/tree/codex/module-0-java-basics) | Java console | Compiles with JDK 8 |
| Exercise 4 Hello | [`codex/exercise-4-hello`](https://github.com/James-rate/programming-2/tree/codex/exercise-4-hello) | Java console | Compiles with JDK 8 |

## Open a project

On GitHub, open the branch selector currently showing `main` and choose the project branch. Each branch contains its own source, README and validation notes.

To clone only one project:

```bash
git clone --branch codex/assignment-2-card-game --single-branch https://github.com/James-rate/programming-2.git javafx-card-game
```

To keep the collection locally and switch projects:

```bash
git clone https://github.com/James-rate/programming-2.git
cd programming-2
git switch codex/blackjack
```

Commit or save your own local changes before switching between projects.

## Runtime and validation

- The Java build helpers use a Java 8 JDK. JavaFX projects require a distribution that includes JavaFX; newer JDKs do not automatically provide that runtime.
- The Python exercise uses Python 3 and only the standard library.
- Nine complete Java source snapshots compiled successfully. The Python exercise passed an AST syntax check.
- The console card-game draft is deliberately incomplete: a matching dependency set was not found, and no replacement code was invented.
- All 10 FXML files parsed, and the 24 bundled resources matched the originals. Representative Store and Blackjack build helpers also produced valid JARs.
- These are compilation, syntax and packaging checks. Applications and interactive gameplay were not run for this collection.

## Local versions retained

| Branch | Additional local source version in its history |
| --- | --- |
| `codex/assignment-2-card-game` | A submission-folder copy with a different dealer FXML view |
| `codex/blackjack` | A local implementation with different parent/child constructor initialization |
| `codex/lab-8-calculator` | A student-edited, incomplete calculator draft before the selected fuller Lab 8 snapshot |

The selected branch heads contain the canonical local snapshots. Repeated identical files are not presented as separate projects.

## Scope and provenance

The collection prioritizes worked projects and exercises. The following local materials were found but excluded from separate project branches:

- Bank and Controls source/resource files that are byte-identical to their supplied course archives.
- Tutor Demos Weeks 2-11, the AverageDays tutor demo, original JavaScaffold archives, the untouched early LoginForm template and other unmodified starters.
- Default IntelliJ and NetBeans starter applications, plus repeated archive copies.
- The Proto-language lexer/parser assignment and arithmetic DFA lexer starter, which belong with the separate Theory of Computer Science materials.

Number to Words is retained as an implemented early Python practice exercise; its topic and download timing match the early course materials, although the file itself has no course code. Module 0 Java Basics and Exercise 4 Hello are additional local introductory exercises whose exact course affiliation is unconfirmed.

Coursework-provided helper classes and existing assets are retained where used by modified projects. Local IDE settings, compiled output and private working files are excluded from the source snapshots. The card-game branch additionally preserves the original supplied JAR, including its original packaging.
