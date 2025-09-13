# Space Race

A retro-inspired, Java-based game where players control a spaceship, dodge asteroids, and fight aliens.  
Built as a Grade 12 Computer Science final project to demonstrate **Java OOP** and **real-time graphics**.

---

## How to Play

1. **Install Java Development Kit (JDK)**
   - Download and install the latest JDK for Windows/macOS/Linux:
     - https://www.oracle.com/java/technologies/downloads/
   - If prompted, enable **JAVA_HOME** during install.

2. **Install a Java IDE**
   - Recommended: [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
   - Alternative: [Eclipse](https://www.eclipse.org/downloads/)

3. **Download JavaFX**
   - Get the JavaFX SDK for your OS: https://gluonhq.com/products/javafx/
   - Unzip it and **note the path** to the SDK (e.g., `C:\javafx-sdk-21\` or `/Users/you/javafx-sdk-21/`).

4. **Get the Game Code**
   - Using Git:
     ```bash
     git clone https://github.com/PrestigeGiraffe/Space-Race.git
     ```
   - Or download the ZIP from GitHub (**Code ▸ Download ZIP**) and unzip it.

5. **Open the Project in Your IDE**
   - **IntelliJ**: `File ▸ Open…` → select the `Space-Race` folder.
   - **Eclipse**: `File ▸ Open Projects from File System…` → select the `Space-Race` folder.

6. **Link JavaFX to the Project**
   - **IntelliJ (Libraries)**
     1. `File ▸ Project Structure ▸ Libraries`
     2. Click **+ ▸ Java**, select the **`lib`** folder inside your JavaFX SDK (e.g., `.../javafx-sdk-21/lib`), **Apply**.
   - **IntelliJ (Run config VM options)**
     1. `Run ▸ Edit Configurations…` → select your run config (or create one for `SpaceRace.java`)
     2. In **VM options**, add:
        ```
        --module-path "<path-to-javafx>/lib" --add-modules=javafx.controls,javafx.fxml
        ```
        Example:
        ```
        --module-path "C:\javafx-sdk-21\lib" --add-modules=javafx.controls,javafx.fxml
        ```
   - **Eclipse**
     1. `Project ▸ Properties ▸ Java Build Path ▸ Libraries ▸ Add External JARs…`
     2. Add **all JARs** from the JavaFX **`lib`** folder.
     3. `Run ▸ Run Configurations… ▸ Arguments ▸ VM arguments` → add:
        ```
        --module-path "<path-to-javafx>/lib" --add-modules=javafx.controls,javafx.fxml
        ```

7. **Run the Game**
   - Open `SpaceRace.java`.
   - Click **Run** in your IDE.
   - Play: use your keyboard to fly, dodge asteroids, and fight aliens.

---

## Quick Links
- JDK: https://www.oracle.com/java/technologies/downloads/
- JavaFX: https://gluonhq.com/products/javafx/
- Repo: https://github.com/PrestigeGiraffe/Space-Race

## Troubleshooting
- **`javafx.*` classes not found** → Step 6 (did you add JavaFX `lib` as a library and set VM options?).
- **`FindException: Module javafx.controls not found`** → The `--module-path` is wrong or points to the wrong JavaFX version.
- **Version mismatch** → Use a JavaFX version compatible with your JDK (e.g., JavaFX 21 with JDK 21).
