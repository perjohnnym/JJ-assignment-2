package com.coderscampus.oop;
import java.util.Random;
import java.util.Scanner;

public class myRandomGenerator {

    public static void main(String[] args) {

//Here we generate a random number betweeen 1 and 100n inclusive
        int generatedNumber = getGeneratedNumber();

        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100:  ");
        String usersGuess = scan.nextLine();
        System.out.println("you typed in:  " + usersGuess);
        int yourGuess = Integer.parseInt(usersGuess);

        int guessAttempt = 1;
        int validGuess = 0;

        while (guessAttempt <5) {
          /*  Scanner scan = new Scanner(System.in);
            System.out.println("Pick a number between 1 and 100:  ");
            String usersGuess = scan.nextLine();
            System.out.println("you typed in:  " + usersGuess);
            int yourGuess = Integer.parseInt(usersGuess);*/

        //   System.out.println("you typed in:  " + usersGuess);

            /* this will throw error message when user guesses outside of range */
            if (yourGuess < 1 || yourGuess > 100) {
                System.out.println("you guessed out of range; your number must be between 1 and 100");
                scan = new Scanner(System.in);
                System.out.println("Pick a number between 1 and 100:  ");
                usersGuess = scan.nextLine();
                System.out.println("you typed in:  " + usersGuess);
                yourGuess = Integer.parseInt(usersGuess);
            }

            //This is when user guesses a number within range
            if (yourGuess > 0 && yourGuess <= 100) {

                //this is when user guesses the system generated number
                if (yourGuess == generatedNumber) {
                    System.out.println("You win! ");
                    validGuess = validGuess + 1;
                    guessAttempt = 6;
                } else if (yourGuess < generatedNumber) {
                    System.out.println("Please pick a higher number.");
                 // generatedNumber = getGeneratedNumber();
                    scan = new Scanner(System.in);
                   // System.out.println("Pick a number between 1 and 100:  ");
                    usersGuess = scan.nextLine();
                    System.out.println("you typed in:  " + usersGuess);
                    yourGuess = Integer.parseInt(usersGuess);
                    validGuess = validGuess + 1;
                    guessAttempt = guessAttempt + 1;
                } else if (yourGuess > generatedNumber) {
                    System.out.println("Please pick a lower number.");
                   // generatedNumber = getGeneratedNumber();
                    scan = new Scanner(System.in);
                 //   System.out.println("Pick a number between 1 and 100:  ");
                    usersGuess = scan.nextLine();
                    System.out.println("you typed in:  " + usersGuess);
                    yourGuess = Integer.parseInt(usersGuess);
                    validGuess = validGuess + 1;
                    guessAttempt = guessAttempt + 1;
                }


            }
            //guessAttempt = guessAttempt + 1;


        }
        if (guessAttempt > 4){
            System.out.println("You lose!");
            System.out.println("The number to guess was " + generatedNumber);
        }
    }

    private static int getGeneratedNumber() {
        Random rand = new Random();
        int generatedNumber = rand.nextInt(100) + 1;
        System.out.println("The random number is: " + generatedNumber);
        return generatedNumber;
    }
}

