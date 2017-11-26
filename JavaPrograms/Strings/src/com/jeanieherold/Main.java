package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        // 8 primitive data types
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        //String - is a class not a primitive data type but treated as a 9th primitive type
        String myString = "This is a string";
        System.out.println("myString : " + myString);
        myString = myString + " plus more text.";
        System.out.println("myString : " + myString);
        myString = myString + " \u00A9 2017";
        System.out.println("myString : " + myString);

        String numberString = "250.55";
        //this will be treated as text only - no numneric calculations by default
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double dbleNumber = 120.47;
        lastString = lastString + dbleNumber;
        System.out.println("lastString is equal to " + lastString);

    }
}
