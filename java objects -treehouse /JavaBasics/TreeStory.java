//working with multiple strings
import java.io.Console;

public class TreeStory {

    public static void main(String[] args) {
        Console console = System.console();
        /*
        some terms
        noun = Person,place or thing
        verb - an action
        adjective - a description used to modify or describe a noun
        enter your amazing code here
        */
        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        console.printf("%s is very %s", name, adjective);
        // can also be written -->
        //
    }
}