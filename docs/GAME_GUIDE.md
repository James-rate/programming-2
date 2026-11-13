# JavaFX Card Game

A local desktop card game from a Java programming coursework project. It uses JavaFX, FXML, and a model-view-controller structure to connect card battles with separate dealer and player windows.

The original Java source, views, images, and supplied JAR are preserved. Repository additions provide build instructions and project documentation.

## Features

- Two default players, **Davey** and **Jenny**, with optional third and fourth players.
- A dealer window with **Deal**, **Play Round**, **Call**, and **Exit** controls.
- Main and secondary decks that can be opened to inspect cards.
- Player hands with card names, attack values, styles, health, and image previews.
- JavaFX properties and observable collections for updating the interface.
- Error dialogs for empty decks, full hands, and rounds without every player's selection.

## How to Play

1. Start the application. Davey and Jenny are fixed, non-editable names in the original implementation. Enter names for players three and four if wanted, then choose **Start Game**.
2. In the dealer window, choose **Deal**. Each player receives a main-deck card in a temporary hand; one player also receives a secondary-deck card, rotating between deals.
3. In each player window, choose a temporary card and press **Place** to add it to the hand. A hand holds at most four cards.
4. Choose a card from each player's hand and press **Select**. Once every player has selected a card, choose **Play Round** in the dealer window.
5. Each selected card attacks the next player's hand. Damage doubles against cards of the same style, and cards with no remaining health are removed.
6. Choose **Call** to display the player with the highest total remaining hand health at that moment. The first player in the list wins a tie.

The original game does not automatically decide when to call the result. It is a learning prototype for local play, with no online multiplayer, account authentication, or saved-game persistence. The opening "Login" screen is player setup, not a real account login.

## Run the Original JAR

The original binary is available at [artifacts/Assignment2.jar](../artifacts/Assignment2.jar).

Use a **Java 8 distribution that includes JavaFX 8**. Ensure `java` refers to that runtime, then run from the repository root:

```powershell
java -jar artifacts/Assignment2.jar
```

The supplied classes target Java 8. Many modern JDK distributions do not bundle JavaFX, so having a newer JDK installed is not sufficient by itself. These instructions retain the original Java 8 setup rather than migrating the application to a new framework or build system.

## Build from Source

On Windows, provide the path to a Java 8 JDK that includes JavaFX:

```powershell
.\build.ps1 -JdkPath 'C:\path\to\jdk8'
```

The script compiles the source, includes the FXML, CSS, and image resources, and writes `build/project.jar`. Run that build with the same JavaFX-enabled Java 8 runtime:

```powershell
java -jar build/project.jar
```

## Project Structure

| Location | Contents |
| --- | --- |
| `src/App.java` | JavaFX application entry point |
| `src/model/` | Cards, decks, players, dealing, combat, and game exceptions |
| `src/controller/` | FXML event handling and interface bindings |
| `src/view/` | FXML layouts, CSS, and image resources |
| `src/au/edu/uts/ap/javafx/` | Retained coursework controller and view-loading helpers |
| `artifacts/Assignment2.jar` | Unchanged copy of the original provided JAR |
| `build.ps1` | Windows source-build helper |
| `build/` | Generated build output |

## Coursework and Verification Notes

The `au.edu.uts.ap.javafx` helper classes and bundled visual assets are retained from the original coursework project.

The original JAR contains IDE metadata that remains unchanged inside that artifact. The source directory in this repository excludes the original IDE project configuration.

All 20 Java source files compiled successfully using a Java 8 JDK with JavaFX. The rebuilt JAR passed archive and resource checks, and all seven FXML files parsed successfully. The original source files, resources, and provided JAR were verified to be unchanged. The game has not been launched or interactively tested as part of preparing this repository.
