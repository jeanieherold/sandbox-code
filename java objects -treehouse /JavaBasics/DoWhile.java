//working with do while loop
//tools 

import java.io.Console;

public class DoWhile {

    public static void main(String[] args) {
        Console console = System.console();
        /*

        */
        // __Name__ is a __adjective__ __noun__. They are always __adverb__ __verb__.
       String ageAsString = console.readLine("How old are you?  ");
       int age = Integer.parseInt(ageAsString);

       //conditional
       if (age < 13) {
           //insert exit code if condition isnt met
           console.printf("Sorry you must be at least 13 to use this program.\n");
           //insert exit code
           System.exit(0);
       }
       
        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        String noun;
        boolean isInvalidWord;
        do {
            noun = console.readLine("Enter a noun:  ");
            isInvalidWord = (noun.equalsIgnoreCase("dork") ||
                                     noun.equalsIgnoreCase("jerk"));
            if (isInvalidWord) {
            console.printf("That language is not allowed. Try again:  \n\n");
            }
        } while (isInvalidWord);

        String adverb = console.readLine("Enter an adverb:  ");
        String verb = console.readLine("Enter a verb ending in -ing:  ");

        console.printf("Your TreeStory:\n---------------\n");
        console.printf("%s is a %s %s.  ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);
    }
}