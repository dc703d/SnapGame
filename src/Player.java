import java.util.Scanner;

public class Player {
    private String name;
    private boolean playerWin;
    Scanner scanner = new Scanner(System.in);

    Player(String name){
        this.name= name;
        this.playerWin=false;
    }

    public void takeTurn(){
        scanner.nextLine();
    }
    public void win(){
        System.out.println("Congratulations! " + this.name + " wins!");
    }
    public String getName(){
        return this.name;
    }
}
