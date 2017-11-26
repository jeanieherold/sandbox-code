package com.jeanieherold;

public class Main {

    public static void main(String[] args) {
        int value = 2;
        System.out.println(value);
        if(value == 1) {
            System.out.println("Value is 1");
        } else if(value == 2) {
            System.out.println("Value is 2");
        } else  {
            System.out.println("Value is not 1 or 2");
        }

        System.out.println("-----------");

        int switchVal = 3;

        switch(switchVal) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                break;
            default:
                System.out.println("Value was something else");
                break;
        }

        System.out.println("------ Challenge -------");

        char letter = 'H';

        switch(letter) {
            case 'A':
                System.out.println("Letter was an A");
                break;
            case 'B':
                System.out.println("Letter was a B");
                break;
            case 'C':
                System.out.println("Letter was a C");
                break;
            case 'D':
                System.out.println("Letter was a D");
                break;
            case 'E':
                System.out.println("Letter was an E");
                break;
            default:
                System.out.println("Letter not A, B, C, D or E");
                break;
        }

        System.out.println("------ month example -------");

        String month = "FebruAry";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            case "april":
                System.out.println("April");
                break;
            default:
                System.out.println("not found");
        }
    }
}
