import java.util.Random;
import java.util.Scanner;

/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");
    Random rand = new Random();
    int number = rand.nextInt(101);
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter your name:");
      String name = input.nextLine();
      System.out.println(name + ", I'm thinking of a number between 0 and 100.");
      System.out.println("Try to guess the number.");

      int guessCount = 0;
      boolean guessCorrect = false;
      while (!guessCorrect) {
        System.out.println("Enter your guess:");
        int guess = input.nextInt();
        guessCount += 1;
        if (guess < number) {
          System.out.println("Your guess is too low, try again.");
        } else if (guess > number) {
          System.out.println("Your guess is too high, try again.");
        } else {
          guessCorrect = true;
          System.out.println("Well done " + name);
          System.out.println("You found my number in " + guessCount + " tries!");
        }
      }
    }
    System.out.println("Thanks for playing.");
  }
}
