package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));


        for(int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("----challenge-1---");
        //challenge - use for statement for interest rates given in challenge - (calculate to 2 decimal places)
        for(int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("----challenge-2---");
        //challenge - modify the loop but start at 8% and go backwards to 2%
        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("----challenge-3---");
        //challenge 3 - see below
        int primeCount = 0;
        for(int i = 1; i <= 100; i++) {
            if(isPrime(i)) {
                primeCount++;
                System.out.println(i + " is a Prime Number");
                if(primeCount == 30) {
                    break;
                }
            }
        }
        System.out.println("Prime Numbers Found " + primeCount);

    }

    //Challenge 3
    //create a for statement using any range of numbers
        //determine if the number is a prime using isPrim method
        //if prime then print and increment prime number found counter
        //exit the for loop once the prime counter is 3 using break


    //method to find all prime numbers. prime numbers must be greater than 0 and only divisible by 1 and itself
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        //in below loop - to optimize - sqr root take less processing time - the below loop loops through
            //significantly less amount of times using sqrt.
        //to write termination statement as sqr root -->  i <= (long) Math.sqrt(n)  -->
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
