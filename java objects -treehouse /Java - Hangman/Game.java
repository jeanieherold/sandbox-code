public class Game {
    public static final int MAX_MISSES = 7;
    private String answer;
    private String hits;
    private String misses;

    //constructor
    public Game(String answer) {
        this.answer = answer.toLowerCase();  //change to lower case to normalize answer
        hits = "";
        misses = "";
    }

    //function to getAnswer to return in the game won or lost message - its a getter
    public String getAnswer() {
        return answer;
    }

    //a private method avialable only to this class - use to return a normalized character and make
    //sure it is a char guess
    private char normalizeGuess(char letter) {
        //exception if guess is not a char
        if (! Character.isLetter(letter)) {
            throw new IllegalArgumentException("A letter is required");
        }
        //normalize char 
        letter = Character.toLowerCase(letter);
        //see if guess has already been guessed --> throw exception if it has been guessed already
        if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1) {
            throw new IllegalArgumentException(letter + " has already been guessed");
        }
        return letter;
    }

    //handling no value on a guess causing a crash - create 2nd applyGuess that takes a string
    public boolean applyGuess (String letters) {
        if (letters.length() == 0) {
            throw new IllegalArgumentException("No letter found");
        }
        return applyGuess(letters.charAt(0));
    }

    //return whether guess was a hit or a miss
    public boolean applyGuess(char letter) {
       //call our private method to normalize guess and check if has been previously guessed
       letter = normalizeGuess(letter);
        //check if guess is a part of the answer
        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit) {
            hits += letter;
        } else {
            misses += letter;
        }
        return isHit;
    }

    //keep track of how many tries the player has left before game over
    public int getRemainingTries() {
        return MAX_MISSES - misses.length();
    }

    //display the current progress
    //return a string with dashes for characters not guessed
    public String getCurrentProgress() {
        String progress = "";
        //enhanced for loop - for each char letter in answer to an array of characters
        for(char letter : answer.toCharArray()) {
            char display = '-';
            if(hits.indexOf(letter) != -1) {
                display = letter;
            }
            progress += display;
        }
        return progress;
    }

    //let user know if won or lost
    public boolean isWon() {
        return getCurrentProgress().indexOf('-') == -1;
    }



}