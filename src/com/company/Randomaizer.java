package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Randomaizer {

    public void generate(int min, int max) {

        Random random = new Random();
        int numOfDigits = max - min + 1;
        ArrayList<Integer> digAlreadyCalled = new ArrayList<Integer>();

        while (true) {
            int generateNumber = random.nextInt(numOfDigits);
            int randNumber = generateNumber + min;
            if (digAlreadyCalled.size() != numOfDigits) {
                if (!digAlreadyCalled.contains(randNumber)) {
                    digAlreadyCalled.add(randNumber);
                    System.out.println("Random number is " + randNumber);
                    break;
                }
            } else {
                System.out.println("All possible numbers has already been generated");
                break;
            }
        }
    }

    public void help() {
        System.out.println("1. Command 'generate' will allow you to generate a number from a given range. \n" +
                "2. Command 'help' is app guide. \n" +
                "3. Command 'exit' will exit the App. \n");
        return;
    }

    public void exit() {
        System.out.println(" Good bye, friend!");
        System.exit(0);
    }

}