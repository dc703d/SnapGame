import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame{
    private String name;
    private ArrayList<Card> deck;
    private final String[] suits = {"\u2665","\u2666","\u2660","\u2663"};
    private final String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private final int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    CardGame(String name){
        this.name = name;
        deck = new ArrayList<Card>();
        populateDeck();
    }

    public void printDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i));
        }
    }

    public void populateDeck(){
        for(int i=0;i<4;i++){
            for(int j =0;j<symbols.length;j++){
                deck.add(new Card(suits[i],symbols[j],values[j]));
            }
        }
    }

    public Card dealCard(){
        Card topCard = this.deck.getFirst();
        this.deck.removeFirst();
        return topCard;
    }

    public void sortDeckInNumberOrder(ArrayList<Card> deck){
        Collections.sort(deck, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return Integer.compare(o1.getValue(),o2.getValue());
            }
        });
    }

    public void sortDeckIntoSuits(ArrayList<Card> deck){
        sortDeckInNumberOrder(deck);
        Collections.sort(deck, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                int suitOrder = getSuitValue(o1.getSuit()) - getSuitValue(o2.getSuit());
                if(suitOrder != 0){
                    return suitOrder;
                }
                return o1.getValue()- o2.getValue();
            }
        });
    }

    public ArrayList<Card> returnDeck(){
        return this.deck;
    }

    public void shuffleDeck(ArrayList<Card> deck){
       Collections.shuffle(deck);
    }

    private int getSuitValue(String suit){
        switch(suit){
            case "\u2660": return 1;
            case "\u2665": return 2;
            case "\u2666": return 3;
            case "\u2663": return 4;
            default: return 0;

        }
    }
}
