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
    //exceptions
    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if(newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("Too many PEZ!");
        }
        pezCount = newAmount;
    }




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