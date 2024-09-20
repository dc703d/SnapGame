import java.util.ArrayList;

public class CardGame {
    private String name;
    private ArrayList<String> deck;

    CardGame(String name){
        this.name = name;

    }

    public void getDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i));
        }
    }
}
