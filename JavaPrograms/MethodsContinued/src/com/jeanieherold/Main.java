package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        System.out.println("---------------------------");

        //challenge
        //calculate position of player according to his score

        displayHighScorePosition("Jeanie", calculateHighScorePosition(1500));
        displayHighScorePosition("David", calculateHighScorePosition(1000));
        displayHighScorePosition("Mooch", calculateHighScorePosition(400));
        displayHighScorePosition("Earl", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition (String player, int position) {
        System.out.println(player + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition (int score) {
        int position;
        if(score > 1000) {
            position = 1;
        } else if(score > 500 && score <= 1000) {
            position = 2;
        } else if(score > 100 && score <= 500) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }

}