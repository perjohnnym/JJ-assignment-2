package com.coderscampus.oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Here we generate a random number betweeen 1 and 100, inclusive
        MyRandomGenerator getNo = new MyRandomGenerator();
        int generatedNumber = getNo.getGeneratedNumber();

        Scanner scan;
        String usersGuess;

        int guessAttempt = 1;
        int validGuess = 0;
        int youWin = 0;

        System.out.println("Pick a number between 1 and 100:  ");
        YourGuess youGuessed = new YourGuess();

        //get user's guess
        int userPredicted = youGuessed.getYourGuess();

        while (guessAttempt <= 4 & youWin == 0) {

            /* this will throw error message when user guesses outside of range */
            if (userPredicted < 1 || userPredicted > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");

                //get users guess
                userPredicted = youGuessed.getYourGuess();
            }

            //This is when user guesses a number within range
            if (userPredicted > 0 && userPredicted <= 100) {

                if (userPredicted < generatedNumber) {
                    System.out.println("Please pick a higher number.");
                    // Capture new guess from user
                    youGuessed = new YourGuess();
                    userPredicted = youGuessed.getYourGuess();
                    validGuess = validGuess + 1;
                    guessAttempt = guessAttempt + 1;
                } else if (userPredicted > generatedNumber) {
                    System.out.println("Please pick a lower number.");
                    // Capture new user's guess
                    youGuessed = new YourGuess();
                    userPredicted = youGuessed.getYourGuess();
                    validGuess = validGuess + 1;
                    guessAttempt = guessAttempt + 1;
                }
                if (userPredicted == generatedNumber) {
                    System.out.println("You win! ");
                    validGuess = validGuess + 1;
                    guessAttempt = guessAttempt + 1;
                    youWin = 1;
                }
            }// end of within range

        } //end of while loop
        if (guessAttempt > 4 && youWin == 0) {
            System.out.println("You lose!");
            System.out.println("The number to guess was " + generatedNumber);
        }
    }
    }




