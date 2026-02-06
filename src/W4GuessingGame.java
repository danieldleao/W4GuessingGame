/**
 * Durham College - Computer Programming and Analysis
 * COSC 1200 Object-Oriented Programming 1 [Ken Hodgson]
 * Daniel Doro Leao | SID: 101042176
 * Date: 2026-01-29
 * Activity Name: Information Delivered
 */

import java.util.Scanner;
import java.util.Random;

public class W4GuessingGame {
    public static void main(String[] args) {
      Random randomGenerator = new Random();
      Scanner input = new Scanner(System.in);
      String playAgain = "y";
      while (playAgain.equalsIgnoreCase("y")) {
        int secretNumber = randomGenerator.nextInt(1, 101);
        int guess = -1;
        int attemptCounter = 0;
        final int MAX_ATTEMPTS = 10;

        // Welcome message
        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it!");
        System.out.println("____________________________");

        // Main Loop
        while (guess != secretNumber && attemptCounter < MAX_ATTEMPTS) {
          attemptCounter++;
          System.out.print("Attempt #:" + attemptCounter + "/" + MAX_ATTEMPTS + " - Enter your guess in a range from 1 to 100: ");
          guess = input.nextInt();
          if (guess > secretNumber) {
            System.out.println("Too high! Try a smaller number.");
          } else if (guess < secretNumber) {
            System.out.print("Too low! Try a bigger number.");

            // The victory message
          } else {
            System.out.println("Correct! You got it! The number is: " + secretNumber);
            System.out.println("You won in " + attemptCounter + " attempts!");
          }
        }
        // Checking if the user lost
        if (guess != secretNumber) {
          System.out.println("\n=== GAME OVER ===");
          System.out.println("You've used all " + MAX_ATTEMPTS + " attempts!");
          System.out.println("The secret number was: " + secretNumber);
          System.out.println("Better luck next time!");
        }
        // Ask if the user wants to play again or leave the game
        System.out.println("\nWould you like to try this game again? ( y / n )");
        playAgain = input.next();
        // Validation loop for the last interaction
        while (!playAgain.equalsIgnoreCase("y") && !playAgain.equalsIgnoreCase("n")) {
          System.out.print("Ops, something wrong! Please enter 'y' or 'n': ");
          playAgain = input.next();
        }
      }
      // Exit Message
      System.out.println("\n***** Thanks for playing! *****");
      System.out.println("Goodbye!");
    }
}