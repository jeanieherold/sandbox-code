package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now = " + result);

        result++;
        System.out.println("Result is now = " + result);

        result--;
        System.out.println("Result is now = " + result);

        result += 2;
        System.out.println("Result is now = " + result);

        result *= 10;
        System.out.println("Result is now = " + result);

        result -= 10;
        System.out.println("Result is now = " + result);

        result /= 10;
        System.out.println("Result is now = " + result);

        //if then statement
        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the high score!");

        if (topScore > 100)
            System.out.println("You got the high score!");

        if (topScore >= 100)
            System.out.println("You got the high score!");

        topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        if (topScore <= 100)
            System.out.println("You got the high score!");

        // and && operator
        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        //second video on operators starts here

        //or || operator
        if((topScore > 90) || (secondTopScore <= 90));
        System.out.println("One of these tests is true");

        int newValue = 50;
        //if(newValue = 50)
            //System.out.println("This creates an error");

        if(newValue == 50)
            System.out.println("This runs without an error");

        //dealing with a boolean already and assigning value of true so evaluated as true and actually works but is an error technically
        boolean isCar = false;
        //this actually sets value of isCar to true
        if(isCar = true)
            System.out.println("This is not suppose to happen");
        isCar = false;

        //shorthand for if isCar == true then wasCar = true else wasCar = false
        boolean wasCar = isCar ? true : false;

        if(isCar)
            System.out.println("wasCar is true");

        isCar = true;

        //now run again and will print
        wasCar = isCar ? true : false;

        if(isCar)
            System.out.println("wasCar is true");


        //Challenge
        double num1 = 20d;
        double num2 = 80d;
        double myTotal = 25d * (num1 + num2);
        System.out.println("myTotal = " + myTotal);
        double remainder = myTotal % 40d;
        System.out.println("remainder of mytTotal / 40 = " + remainder);

        if(remainder <= 20)
            System.out.println("Total was over the limit");
    }
}
