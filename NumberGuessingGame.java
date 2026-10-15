import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("================================");
        System.out.println("     NUMBER GUESSING GAME");
        System.out.println("================================");
        System.out.println("I have selected a number from 1 to 100.");
        System.out.println("Try to guess the correct number!");

        while (guess != number) {
            System.out.print("\nEnter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid whole number.");
                sc.next();
                continue;
            }

            guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100.");
                continue;
            }

            attempts++;

            if (guess < number) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > number) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("\nCongratulations! You guessed it!");
                System.out.println("Correct number: " + number);
                System.out.println("Total guesses: " + attempts);
            }
        }

        sc.close();
    }
}