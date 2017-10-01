class PezDispenser {
    //private modifier will hide this field from any access outside of this object 
    //meaninng can only be used or accessed here- not in any other file
    
    //use final in front of public to make it so it cannot be changed once defined. 
    final private String characterName;

    //constructor (has no return type) - name the same as the class Name - needs a parameter (make it something obvious but can be anything)
    public PezDispenser(String characterName) {
        //'this' refers to characterName inside this class - characterName on right of '=' is the characterName given as a parameter in Example.java code
        //to avoid the confusion of 'naming collisions - where it is confusing to know what each characterName is referring to'
        //there is a standard that puts a prefix on the variables inside the class 
        //android often uses 'm' for member character --> mCharacterName 
        //follow the coding style of what is determined by your team
        this.characterName = characterName;
    }

    //method
    public String getCharacterName() {
        return characterName;
    }

    //method that returns original character - swaps head of new with old
    //the method below cannot be compiled if the private String characterName is written with 'final' modifier
    //'final' protects the code from being changed once it is created or 'instantiated or initialized'
    public String swapHead(String characterName) {
        String originalCharacterName = this.characterName;
        this.characterName = characterName;
        return originalCharacterName;
    }
}