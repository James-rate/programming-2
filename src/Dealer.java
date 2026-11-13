public class Dealer {
    private final Deck mainDeck;
    private final Deck secondaryDeck;
    private final Player[] players;
    private int turnCounter = 0;
    private static final int PLAYER_COUNT = 3;

    public Dealer() {
        this.mainDeck = new Deck(16);
        this.secondaryDeck = new Deck(8);
        this.players = new Player[PLAYER_COUNT];
        for (int i = 0; i < PLAYER_COUNT; i++) {
            players[i] = new Player();
        }
    }

    private void use() {
        char choice;
        while((choice=readChoice())!='x'){
            switch(choice){
                case 'p': playRound(); break;
                case 'g': showGamestatus(); break;
                case 'd': showDeck(); break;
                default: help(); break;
            }
        }
        endGameSummary();
    }

    private char readChoice(){
        System.out.print("Choice (p/g/d/x): ");
        return In.nextChar();
    }
    private void playRound(){
        System.out.println("Playing round "+(turnCounter+1));
        for(int current=0; current<players.length; current++){
        Player currentPlayer=players[current];
        int target=(current+1)%players.length;
        Player targetPlayer=players[target];
        System.out.println("Player "+(current+1)+"'s turn");
        System.out.println("Dealer deals:");
        Card mainCard=mainDeck.dealCard();
        System.out.println("Main: "+mainCard);

        Card secondaryCard=null;
        boolean hasSecondary=hasSecondary(current);
        if(hasSecondary){
            secondaryCard=secondaryDeck.dealCard();
            System.out.println("Secondary: "+secondaryCard);
        }
        currentPlayer.showHand();
        if(hasSecondary){
            if(!currentPlayer.isHandFull()){
                System.out.print("Would you like to store the secondary card in your hand (y/n): ");
                char secondaryChoice=In.nextChar();
                if(secondaryChoice=='y'){
                    currentPlayer.addCard(secondaryCard);
                }
            }
            currentPlayer.showHand();
        }
        
        Card playedCard;
        if (currentPlayer.isHandFull()){
            playedCard=mainCard;
        }else{
        System.out.print("Would you like to place main in your hand (h) or play (p): ");
        char choice=In.nextChar();
        if (choice=='p'){
            playedCard=mainCard;
        }else{
            currentPlayer.addCard(mainCard);
            currentPlayer.showHand();
            playedCard=currentPlayer.chooseToPlay();
        }
        }
        targetPlayer.receiveAttack(playedCard);
        }
        turnCounter++;
    }
    private void showGamestatus(){
        for (int i=0; i<players.length; i++){
            int total=players[i].getTotalHealth();
            System.out.println("Player "+(i+1)+": "+total);
        }
    }
    private void showDeck(){
        System.out.println("Main deck:");
        mainDeck.showDeck();
        System.out.println();
        System.out.println("Secondary deck:");
        secondaryDeck.showDeck();
    }
    private void help() {
        System.out.println("Menu options are:");
        System.out.println("p: Play round");
        System.out.println("g: Show game status");
        System.out.println("d: Show deck contents");
        System.out.println("x: End game");
    }
    private void endGameSummary(){
        System.out.println("Dealer has called the game!");
        System.out.println("Game finished after "+turnCounter+ " rounds");
        int bestPlayer=0;
        int bestScore=players[0].getTotalHealth();
        for(int i=0; i<players.length; i++){
            int score=players[i].getTotalHealth();
            if(score>bestScore){
                bestScore=score;
                bestPlayer=i;
            }
        }
        System.out.println("Player "+(bestPlayer+1)+" finished with the highest score of "+bestScore);
    }
    private boolean hasSecondary(int current){
        int secondaryCard=turnCounter*players.length+current;
        return (secondaryCard+1)%(players.length-1)==0;
    }

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.use();
    }
}
