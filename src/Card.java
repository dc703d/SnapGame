public class Card {
    private final String suit;
    private final String symbol;
    private final int value;

    Card(String suit,String symbol,int value){
        this.suit = suit;
        this.symbol=symbol;
        this.value=value;
    }

    @Override
    public String toString(){
        return(String.format("Suit: %s, Symbol: %s, Value: %d",suit,symbol,value));
    }

    public int getValue(){
        return this.value;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getSymbol(){
        return this.symbol;
    }
}
