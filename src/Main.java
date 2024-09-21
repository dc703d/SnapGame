
public class Main {
    public static void main(String[] args) {
        Snap snap = new Snap();
        snap.shuffleDeck(snap.returnDeck());
        snap.getFirstCard();

        while(snap.getWin().get() != true) {
            snap.getCard();
        }






    }

}