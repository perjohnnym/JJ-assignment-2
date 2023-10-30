package com.coderscampus.oop;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Here we generate a random number betweeen 1 and 100, inclusive
        MyRandomGenerator getNo = new MyRandomGenerator();
        int generatedNumber = getNo.getGeneratedNumber();

        Scanner scan;
        String usersGuess;

        int guessAttempt = 0;
        int validGuess = 0;
        int youWin = 0;

        System.out.println("Pick a number between 1 and 100:  ");
        YourGuess youGuessed = new YourGuess();

        //get user's guess
        int userPredicted = 0;

        while (guessAttempt < 5) {

            userPredicted = youGuessed.getYourGuess();

            /* this will throw error message when user guesses outside of range */
            if (userPredicted < 1 || userPredicted > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");
                //we skip rest of logic and continue the while -loop
                continue;  //this 'continue' will return control to the while-loop
            }

                if (userPredicted == generatedNumber) {
                    System.out.println("You win! ");
                    break; //this 'break' will exit the while-loop
                } else if (userPredicted < generatedNumber) {
                    System.out.println("Please pick a higher number.");
                    // Capture new guess from user
                    guessAttempt = guessAttempt + 1;
                } else if (userPredicted > generatedNumber) {
                    System.out.println("Please pick a lower number.");
                    // Capture new user's guess
                    guessAttempt = guessAttempt + 1;
                }

        } //end of while loop

        if (userPredicted != generatedNumber) {
            System.out.println("You lose!");
            System.out.println("The number to guess was " + generatedNumber);
        }
    }
    }




