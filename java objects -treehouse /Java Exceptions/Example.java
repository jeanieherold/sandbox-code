
public class Example {

    public static void main(String[] args) {
        //code goes here
        System.out.println("We are making a new PEZ dispenser");
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser. %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser is %s %n", 
                            dispenser.getCharacterName());

        
        if(dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }

        System.out.println("Filling the dipenser with delicious PEZ...");
        dispenser.fill();
        if(!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }

        while (dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        if (dispenser.isEmpty()) {
            System.out.println("Ate all the PEZ");
        }
        dispenser.fill(4);
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("CHomp!!");
        }
        try {
            dispenser.fill(400);
            System.out.println("this will never happen");
        } catch (IllegalArgumentException iae) {
            System.out.println("Whoa there!");
            System.out.printf("The error was %s", iae.getMessage());
        }

    }
}