# Validation

Checked on 13 November 2026.

## Scope

The source files were checked without launching applications, opening game windows, executing interactive programs, or contacting external services. Original source and resource contents were not changed.

## Results

- Java compilation: **failed** for 3 source file(s), using JDK 8 with JavaFX available.
- Compiler exit code: `1`.
- Class files produced: 0.
- Original-file SHA-256 checks: all matched.
- Bundled resource files copied and byte-checked: 0.
- FXML XML parsing: 0 file(s), 0 parse error(s).
- Missing referenced resource files: 0.
- Missing FXML controller classes after successful compilation: 0.

## Existing Source Limitations

The original snapshot does not compile as provided. It is retained unchanged as an unfinished learning snapshot. No application code was changed to address these diagnostics.

## Compiler or Syntax Diagnostics

```text
src\Card.java:4: error: cannot find symbol
    private final WeaponStyle style;
                  ^
  symbol:   class WeaponStyle
  location: class Card
src\Card.java:8: error: cannot find symbol
    public Card(String name, int attack, WeaponStyle style) {
                                         ^
  symbol:   class WeaponStyle
  location: class Card
src\Card.java:29: error: cannot find symbol
    public WeaponStyle getStyle(){
           ^
  symbol:   class WeaponStyle
  location: class Card
src\Dealer.java:2: error: cannot find symbol
    private final Deck mainDeck;
                  ^
  symbol:   class Deck
  location: class Dealer
src\Dealer.java:3: error: cannot find symbol
    private final Deck secondaryDeck;
                  ^
  symbol:   class Deck
  location: class Dealer
src\Dealer.java:9: error: cannot find symbol
        this.mainDeck = new Deck(16);
                            ^
  symbol:   class Deck
  location: class Dealer
src\Dealer.java:10: error: cannot find symbol
        this.secondaryDeck = new Deck(8);
                                 ^
  symbol:   class Deck
  location: class Dealer
src\Dealer.java:32: error: cannot find symbol
        return In.nextChar();
               ^
  symbol:   variable In
  location: class Dealer
src\Dealer.java:55: error: cannot find symbol
                char secondaryChoice=In.nextChar();
                                     ^
  symbol:   variable In
  location: class Dealer
src\Dealer.java:68: error: cannot find symbol
        char choice=In.nextChar();
                    ^
  symbol:   variable In
  location: class Dealer
src\Player.java:38: error: cannot find symbol
    int choice =In.nextInt();
                ^
  symbol:   variable In
  location: class Player
11 errors
```

## Limits

Successful compilation and XML parsing do not establish correct UI behavior, input handling, game rules, or complete runtime functionality. These checks did not modify or retest the original project interactively.
