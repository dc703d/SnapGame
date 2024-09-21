import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

public class Snap extends CardGame{
    private Card previousCard;
    private Player player1 = new Player("Player 1");
    private Player player2 = new Player("Player 2");
    private AtomicBoolean gameOver = new AtomicBoolean(false);
    private final int TIMER_TIME = 2000;
    private Player previousPlayer = player2;
    Scanner scanner = new Scanner(System.in);
    Timer timer = new Timer();
    Snap() {
        super("Snap");
    }

    public void checkWin(Card newCard){
        if(previousCard.getSymbol() == newCard.getSymbol()){
            System.out.println("...");
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if(!gameOver.get()){
                        System.out.println("You lose! Time ran out!");
                        gameOver.set(true);
                        System.exit(0);
                    }
                }
            },TIMER_TIME);
            String userInput = scanner.nextLine();
            gameOver.set(true);
            timer.cancel();

            if (userInput.equalsIgnoreCase("snap")){
                gameOver.set(true);
                previousPlayer.win();
            } else {
                gameOver.set(true);
                System.out.println("You lost...");
            }


        }
        previousCard = newCard;
    }

    public void getCard(){
        if(previousPlayer.getName() == player2.getName()) {
            System.out.println("Player 1, please take a card.");
            scanner.nextLine();
            Card removedCard = this.dealCard();
            System.out.println("Player 1's Card: " + removedCard);
            previousPlayer = player1;
            checkWin(removedCard);
        }
        else if(previousPlayer.getName() == player1.getName()){
            System.out.println("Player 2, please take a card.");
            player2.takeTurn();
            Card removedCard = this.dealCard();
            System.out.println("Player 2's Card: " + removedCard);
            previousPlayer = player2;
            checkWin(removedCard);
        }
    }

    public void getFirstCard(){
        Card removedCard = this.dealCard();
        System.out.println(removedCard);
        previousCard = removedCard;
    }
    public AtomicBoolean getWin(){
        return this.gameOver;
    }

}
