package com.jeanieherold;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //if one line in the if code block no brackets necessary otherwise brackets needed
        if(score == 5000)
            System.out.println("Your score was 5000");
        //brackets are cleaner reading
        if(score == 5000) {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        }

        System.out.println("----------------------");
        //if else
        score = 800;
        if(score < 5000 && score > 1000) {
            System.out.println("Your score is less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        System.out.println("----------------------");
        // gameOver == true is same as gameOver since boolean
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            //if i change the value of finaScore here and dont change in code block below - the finalscores wont be calculated the same. DRY code - dont repeat your code
            //we will keep it DRY with methods - next video
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        //cant do this - variable created inside the codeblock scope - cant access outside of that code block
            //int savedFInalScore = finalScore;

        System.out.println("----------------------");
        //challenge

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        //this is duplicating code above - can cause problems if you change code in one area and not another
        //also in terms of players.. game might be over for one player but not another
        //also if you change code in one place and dont change everywhere it can cause unforeseen issues
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
