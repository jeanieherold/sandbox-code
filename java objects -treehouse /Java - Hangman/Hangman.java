//to start the game in console 
//clear && javac Hangman.java && java Hangman secretword
//'secretword' above is the parameter you are passing in for 'args' 

public class Hangman {

    public static void main(String[] args) {
        //code
        //make sure the answer is passed in - make sure a value for args
        if (args.length == 0) {
            //terminal command
            System.out.println("Usage: java Hangman <answer>");
            //error message
            System.out.println("answer is required");
            //exit out of the program
            System.exit(1);
        }

        //create a new game
        Game game = new Game(args[0]);
        //create a player for the game
        Prompter prompter = new Prompter(game);

        //keep asking for a guess until win or game over
        while (game.getRemainingTries() > 0 && !game.isWon()) {
            //display progress
            prompter.displayProgress();
            //see if a guess is correct
            prompter.promptForGuess();
        }
        prompter.displayOutcome();
    }
}