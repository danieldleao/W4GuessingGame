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
      int secretNumber = randomGenerator.nextInt(1, 101);
      Scanner input = new Scanner(System.in);
      int guess = -1;
      while (guess != secretNumber) {
        System.out.print("Guess the secret number (1 to 100): ");
        guess = input.nextInt();
        if (guess > secretNumber) {
          System.out.println("Too high!");
        } else if (guess < secretNumber) {
          System.out.print("Too low!");
        } else {
          System.out.println("Correct!");
        }
      }
    }
}
