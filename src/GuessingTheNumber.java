//import java.util.Random;  // Importing Scanner class for input
import java.util.Scanner;   // Importing Random class to generate random numbers

public class GuessingTheNumber {

        public static void main(String[] args) {
        // Scanner object for input
        Scanner sc = new Scanner(System.in);
        int roundsWon = 0;  // Counter for rounds won
        boolean playAgain = true;  // Flag for multiple rounds

        // Loop to allow multiple rounds
        while (playAgain) {
            int targetNumber =50;
            // Step 1: Generate a random number between 1 and 100 using Math.random()
           // int targetNumber = (int)(Math.random() * 100) + 1;  // Random number from 1 to 100

            // Step 2: Initialize variables for tracking attempts
            int userGuess = 0;
            int attempts = 0;
            int maxAttempts = 8;  // Maximum attempts allowed

            // Step 3: Start the guessing process
            System.out.println("Guess the number between 1 and 100:");

            // Loop for the guessing process with a limit on attempts
            while (userGuess != targetNumber && attempts < maxAttempts) {
                // Prompt user to enter a guess
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();
                attempts++;

                // Step 4: Compare the guess with the target number
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    roundsWon++;  // Increase the win count if the user guesses correctly
                    break;  // End the loop if the guess is correct
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                // Check if the user has exceeded the max attempts
                if (attempts >= maxAttempts) {
                    System.out.println("Sorry, you've exceeded the maximum attempts. The correct number was: " + targetNumber);
                }
            }

            // Step 5: Ask if the user wants to play again
            System.out.println("Rounds won: " + roundsWon);  // Display the number of rounds won
            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.next();
            if (response.equalsIgnoreCase("no")) {
                playAgain = false;  // Exit the loop if the user doesn't want to play again
            }
        }

        // Closing the scanner to avoid memory leak
        sc.close();
    }
}
    

