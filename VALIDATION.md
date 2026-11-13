# Validation

Checked on 13 November 2026.

## Scope

The source files were checked without launching applications, opening game windows, executing interactive programs, or contacting external services. Original source and resource contents were not changed.

## Results

- Java compilation: **passed** for 9 source file(s), using JDK 8 with JavaFX available.
- Compiler exit code: `0`.
- Class files produced: 9.
- Original-file SHA-256 checks: all matched.
- Bundled resource files copied and byte-checked: 3.
- FXML XML parsing: 2 file(s), 0 parse error(s).
- Missing referenced resource files: 0.
- Missing FXML controller classes after successful compilation: 0.
- The added build helper also passed an actual packaging check in an isolated copy: its JAR has entry class `StoreApplication`, passes archive integrity checks, and contains all 3 bundled resource file(s) byte-for-byte. The canonical snapshot and its original source were not modified by the check.

## Compiler or Syntax Diagnostics

```text
Note: src\au\edu\uts\ap\javafx\ViewLoader.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
```

## Limits

Successful compilation and XML parsing do not establish correct UI behavior, input handling, game rules, or complete runtime functionality. These checks did not modify or retest the original project interactively.
