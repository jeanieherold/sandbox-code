class PezDispenser {
    //fields -->
    public static final int MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;
    
    //constructor -->
        public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    //methods -->
    public String getCharacterName() {
        return characterName;
    }
    //void method if no return value
    public void fill() {
        pezCount = MAX_PEZ;
    }
    //method overloading - using same name for 2 diff methods but 
    //when compile - they will be seen as separate methods IF they have doff parameters
    //i..e. - the one above has no parameters and this one takes one parameter
    //used often to provide 2 entry points for your task - elimates the need to come up with other names for methods that 
    //do similar things - like String.valueOf() has lots of diff parameters that make each seen as diff. 
    //basically one method that accepts different arguments - SO - you can use this to provide default values
    public void fill(int pezAmount) {
        pezCount += pezAmount;
    }

    
    /*
    //you could write the above 2 with the first calling the second in the body of the function
 
    public void fill() {
        fill(MAX_PEZ); //this is calling the fill method below that takes a parameter
                        // this will now get any changes that happen in the method below automatically
                            - just call the other method with the default value like here
    }


    public void fill(int pezAmount) {
        pezCount += pezAmount;
    }

*/






    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }
}