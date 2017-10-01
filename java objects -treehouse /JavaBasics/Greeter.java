//Practicing input and output in java
//tools 

import java.io.Console;

public class Greeter {

    public static void main(String[] args) {
        Console console = System.console();
        //TODO 1. Create a new string named place and assign it a vlaue of your choosing
        String place = "Big Sky";
        //TODO 2. Using the provided console object,
        //        prompt the user 'What is your first name?" and store that in a variable"'
        String name = console.readLine("What is your name?");
        //TODO 3. Print out to the console "Hello <FIRST_NAME>! Welcome to <PLACE>."
        console.printf("Hello %s! %nWelcome to %s. %n", name, place);
    }
}