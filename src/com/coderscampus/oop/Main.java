package com.coderscampus.oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Here we generate a random number betweeen 1 and 100, inclusive
        myRandomGenerator getNo = new myRandomGenerator();
        int generatedNumber = getNo.getGeneratedNumber();


        Scanner scan;
        String usersGuess;

        int guessAttempt = 1;
        int validGuess = 0;
        int youWin = 0;

        System.out.println("Pick a number between 1 and 100:  ");
        yourGuess youGuessed = new yourGuess();

        //get user's guess
        int youPredicted = youGuessed.getYourGuess();

        while (guessAttempt < 5) {

            /* this will throw error message when user guesses outside of range */
          if (youPredicted < 1 || youPredicted > 100) {
               System.out.println("Your guess is not between 1 and 100, please try again");

               //get users guess
               youPredicted = youGuessed.getYourGuess();
            }

            //This is when user guesses a number within range
            if (youPredicted > 0 && youPredicted <= 100) {

                if (youPredicted == generatedNumber) {
                    System.out.println("You win! ");
                    validGuess = validGuess + 1;
                    guessAttempt = 6;
                    youWin = 1;
                } else if (youPredicted < generatedNumber) {
                    System.out.println("Please pick a higher number.");
                    // Capture new guess from user
                    youGuessed = new yourGuess();
                    youPredicted = youGuessed.getYourGuess();
                    validGuess = validGuess + 1;
                    guessAttempt = guessAttempt + 1;
                } else if (youPredicted > generatedNumber) {
                    System.out.println("Please pick a lower number.");
                    // Capture new user's guess
                    youGuessed = new yourGuess();
                    youPredicted = youGuessed.getYourGuess();
                    validGuess = validGuess + 1;
                    guessAttempt = guessAttempt + 1;
                }
            }// end of within range

        } //end of while loop
        if (guessAttempt > 4 && youWin == 0) {
            System.out.println("You lose!");
            System.out.println("The number to guess was " + generatedNumber);
        }

    }

    }




