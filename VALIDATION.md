# Validation

Checked on 13 November 2026.

## Scope

The source files were checked without launching applications, opening game windows, executing interactive programs, or contacting external services. Original source and resource contents were not changed.

## Results

- Java compilation: **passed** for 7 source file(s), using JDK 8 with JavaFX available.
- Compiler exit code: `0`.
- Class files produced: 7.
- Original-file SHA-256 checks: all matched.
- Bundled resource files copied and byte-checked: 0.
- FXML XML parsing: 0 file(s), 0 parse error(s).
- Missing referenced resource files: 0.
- Missing FXML controller classes after successful compilation: 0.
- The added build helper also passed an actual packaging check in an isolated copy: its JAR has entry class `Dealer`, passes archive integrity checks, and contains all 0 bundled resource file(s) byte-for-byte. The canonical snapshot and its original source were not modified by the check.

## Limits

Successful compilation and XML parsing do not establish correct UI behavior, input handling, game rules, or complete runtime functionality. These checks did not modify or retest the original project interactively.
