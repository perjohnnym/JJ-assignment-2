package com.coderscampus.oop;
import java.util.Random;

public class myRandomGenerator {

 //   int generatedNumber = getGeneratedNumber();

    int getGeneratedNumber() {
        Random rand = new Random();
        int generatedNumber = rand.nextInt(100) + 1;
        System.out.println("The random number is: " + generatedNumber);
        return generatedNumber;
    }

}