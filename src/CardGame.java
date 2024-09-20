
import java.util.ArrayList;

public class CardGame {
    private String name;
    private ArrayList<Card> deck = new ArrayList<Card>();
    private final String[] suits = {"\u2665","\u2666","\u2660","\u2663"};
    private final String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    CardGame(String name){
        this.name = name;
        populateDeck();
    }

    public void getDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i));
        }
    }

    private void populateDeck(){
        for(int i=0;i<4;i++){
            for(int j =0;j<symbols.length;j++){
                deck.add(new Card(suits[i],symbols[j],values[j]));
            }
        }
    }

    public Card dealCard(ArrayList<Card> deck){
        Card topCard = deck.get(0);
        deck.remove(0);
        return topCard;
    }
}
