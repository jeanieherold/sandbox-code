import java.util.Scanner;

public class Prompter {
    private Game game;

    //constructor
    public Prompter(Game game) {
        this.game = game;
    }

    //ask the player for a guess
    public boolean promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        //boolean for isHit set to false until found in answer
        boolean isHit = false;
        //variable to keep track of if we got an acceptable value
        boolean isAcceptable = false;
        //loop that we want to make sure runs at lease once - so do/while loop
        do {
            System.out.print("Enter a letter:  ");
            String guessInput = scanner.nextLine();

            //try/catch applyGuess to see if exception thrown for already guessed letter
            //remember - can call the catch anything - we use iae for illegal arg exception
            try {
                isHit = game.applyGuess(guessInput);
                //change isAcceptable to true if game.applyGuess is true
                isAcceptable = true;
                } catch(IllegalArgumentException iae) {
                System.out.printf("%s. Please try again. %n",
                                   iae.getMessage());
            }
        } while(!isAcceptable);
        return isHit;
    }
    //display progress
    public void displayProgress() {
        //%d is number formatting --> see docs.oracle.com search number formatting - %d stands for decimal
        System.out.printf("You have %d tries left to solve: %s%n",
                          game.getRemainingTries(),
                          game.getCurrentProgress());
    }

    public void displayOutcome() {
        if (game.isWon()) {
            System.out.printf("Congratulations you won with %d tries remaining.%n",
                                game.getRemainingTries());
        } else {
            System.out.printf("Bummer, the word was %s. :( %n",
                                game.getAnswer());
        }
    }
}