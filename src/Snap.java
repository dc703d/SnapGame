import java.util.Scanner;

public class Snap extends CardGame{
    private Card previousCard;
    public boolean win = false;
    Scanner scanner = new Scanner(System.in);
    Snap() {
        super("Snap");
    }

    public void checkWin(Card newCard){
        if(previousCard.getSymbol() == newCard.getSymbol()){
            win=true;
        }
        previousCard = newCard;
    }

    public void getCard(){
        scanner.nextLine();
        Card removedCard = this.dealCard();
        System.out.println(removedCard);
        checkWin(removedCard);
    }

    public void getFirstCard(){
        Card removedCard = this.dealCard();
        System.out.println(removedCard);
        previousCard = removedCard;
    }

}
