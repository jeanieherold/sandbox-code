package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        //Float compares to a whole number - single precision number
        //Doubles compare to decimals and have twice as much detail as a Float

        //width of int = 32 (4 bytes)
        int myIntValue = 5/3 ;

        //has 7 decimal points of precision after decimal point
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f/3f;

        //has 16 decimal points of precision after decimal point
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d/3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubeValue = " + myDoubleValue);

        //Challenge
        double pounds = 200d;
        double poundsInKilos = pounds * 0.45359237d;

        System.out.println(pounds + " pounds is equal to " + poundsInKilos + " kilos");
        //can use underscore to made numbers more readable
        double pi = 3.1415_927d;
;    }
}
