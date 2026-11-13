import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Player {
    private final ArrayList<Card> hand;
    public static final int MAX_HAND_SIZE = 2;

    public Player() {
        this.hand = new ArrayList<Card>();
    }
    public int getTotalHealth(){
        int sum=0;
        for(Card c: hand){
            sum+=c.getHealth();
        }
        return sum;
    }
    public void showHand(){
        System.out.println("------------------------");
        System.out.println("HAND");
        System.out.println("------------------------");
        if(hand.isEmpty()){
            System.out.println("Empty");
        }else{
            for(int i=0; i<MAX_HAND_SIZE; i++){
                if(i<hand.size()){
                    System.out.println((i+1)+": "+hand.get(i));
                }else{
                    System.out.println((i+1)+":");
                }
         }
        }
        System.out.println("------------------------");
    }
public Card chooseToPlay(){
    System.out.print("Card to play: ");
    int choice =In.nextInt();
    return hand.remove(choice-1);
}
public void receiveAttack(Card attackCard){
    Iterator<Card> it=hand.iterator();
    while(it.hasNext()){
    Card c=it.next();
    int damage=attackCard.getAttack();
    if(c.getStyle().equals(attackCard.getStyle())){
        damage*=2;
    }
    c.setHealth(c.getHealth()-damage);
    if (c.getHealth()<=0){
        it.remove();
    }
}
}
public boolean isHandFull(){
    return hand.size()==MAX_HAND_SIZE;
}
public void addCard(Card card){
    if(!isHandFull()){
        hand.add(card);
    }
}
}
