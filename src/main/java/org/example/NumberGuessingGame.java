package org.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int userGuess = 0;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Can you guess it?");

            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
