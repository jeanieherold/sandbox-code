package com.jeanieherold;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while(count != 5) {
            System.out.println("count value is " + count);
            count++;
        }

        System.out.println("same test written with boolean-->");
        count = 0;
        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("count value is " + count);
            count++;
        }

        // do while
        System.out.println("same test with do while loop-->");
        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 5);

        //challenge 1 - just the even numbers should print on the screen
        System.out.println("-----challenge-1-----");
        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("even number " + number);
            number++;
        }
        //challenge 2 - modify the while loop
        //make it record total number of even numbers found and break once 5 are found
        //at the end - display the total number of even numbers found
        System.out.println("-----challenge-2-----");
        int number2 = 5;
        int finishNumber2 = 20;
        int evensFound = 0;
        while(number2 <= finishNumber2) {
            if(!isEvenNumber(number2)) {
                number2++;
                continue;
            }
            System.out.println("even number2 " + number2);
            number2++;
            evensFound++;
            if(evensFound == 5) {
                break;
            }
        }
        System.out.println("Number of even numbers found = " + evensFound);

    }

    //challenge
        //create a method called isEvenNumber - takes an int param - determine is integer passed to method is even or not

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
