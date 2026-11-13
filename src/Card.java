public class Card {
    private final String name;
    private final int attack;
    private final WeaponStyle style;
    private int health;
    private boolean isActive;

    public Card(String name, int attack, WeaponStyle style) {
        this.name = name;
        this.attack = attack;
        this.style = style;
        this.health = 100;
        this.isActive = true;
    }

    //Do not remove this. You do not need to use this in your implementation.
    public static Card copy(Card card) {
        return new Card(card.name, card.attack, card.style);
    }
    public int getAttack(){
        return attack;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health=health;
    }
    public WeaponStyle getStyle(){
        return style;
    }
    public String toString(){
        return style+": "+name+" [A:"+attack +"] (100% Health)";
    }
}
