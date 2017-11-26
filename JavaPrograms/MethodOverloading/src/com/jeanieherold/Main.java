package com.jeanieherold;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Jeanie", 500);
        System.out.println("New score is " + newScore);
        System.out.println("---------------------");
        calculateScore(75);
        System.out.println("---------------------");
        calculateScore();
        //challenge
        System.out.println("---------------------");
        calcFeetAndInchesToCentimeters(6, 0);
        System.out.println("---------------------");
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    //challenge

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        double totalInches;
        double centimeters;
        if(feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("invalid feet or inches value");
            return -1;
        }
        totalInches = inches + feet * 12;
        centimeters = totalInches * 2.54;
        System.out.println(feet + " ft " + inches + " in = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet;
        double remainingInches;
        if(inches >=0){
            feet = (int) inches / 12;
            remainingInches = (int) inches % 12;
            System.out.println(inches + " in = " + feet + " ft " + remainingInches + " in");
        } else {
            return -1;
        }
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


}
