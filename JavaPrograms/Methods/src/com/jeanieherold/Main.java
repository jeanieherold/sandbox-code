package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        //main method is cleaner and just calls methods however many times needed
        //hard coded values
        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        //code with variables - either way works
        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    //new method outside of public static void main method
    //void means dont return anything back to main
//        public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//            if(gameOver) {
//                int finalScore = score + (levelCompleted * bonus);
//                finalScore += 2000;
//                System.out.println("Your final score was " + finalScore);
//            }
//        }

    //remove void to return data back to main method
    //will return back the data type of the method created - this case == int
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }





}
