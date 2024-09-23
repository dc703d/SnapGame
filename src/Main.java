
public class Main {
    public static void main(String[] args) {
        Snap snap = new Snap();
        snap.shuffleDeck(snap.returnDeck());
        snap.makePlayers();
        snap.getFirstCard();
        while(snap.getWin().get() != true) {
            snap.getCard();
            System.out.println(snap.getArrayListLength());
            if(snap.getArrayListLength() < 1){
                System.out.println("Reshuffling Deck...");
                snap.populateDeck();
                snap.shuffleDeck(snap.returnDeck());
            }
        }
    }


}