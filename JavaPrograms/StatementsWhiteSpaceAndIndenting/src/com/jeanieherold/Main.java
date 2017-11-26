package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        //statement is the entire line below - including data type and semicolon
        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        //multiple statements on one line is ok but confusing so dont do unless reason
        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is ok too.");

        //extra white space is ok but dont do unless reason
        int dontDo =
                50;
        System.out.println(dontDo);

        //indenting - more readable - do proper indenting with code blocks
        //intelliJ --> Code/Reformat Code - command opt L
        if (myVariable <= 50) {
            System.out.println("myVariable = " + myVariable);
        }


    }
}
