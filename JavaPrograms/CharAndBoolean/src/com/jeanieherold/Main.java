package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        //one letter or one character
        //width of char = 16 (2 bytes)
        char myChar = 'D';
        //copyright symbol usng unicode
        char unicode = '\u00A9';
        System.out.println("Copyright symbol : " + unicode);

        //boolean - testing for true and false

        boolean myBoolean = true;
        boolean isMale = true;

        //challenge
        //display the registered sybol using unicode
        char registered = '\u00AE';
        System.out.println("Registered symbol : " + registered);
    }
}
