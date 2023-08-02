package com.coderscampus.oop;
import java.util.Scanner;

public class YourGuess {



    int getYourGuess() {
        Scanner scan = new Scanner(System.in);
        String usersGuess = scan.nextLine();
       // System.out.println("you typed in:  " + usersGuess);
        int yourGuess = Integer.parseInt(usersGuess);
        return yourGuess;
    }

}

