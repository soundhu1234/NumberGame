/*# NumberGame
It is a simple number guessing game using a java programming  */
import java.util.Scanner;
import java.util.Random;

public class SimpleNumGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            int maxAttempts = 5;
            
            System.out.println("Welcome to Guess the Number!");
            System.out.println("I have generated a number between " + minRange + " and " + maxRange + ". Guess it!");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                
                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The number was: " + generatedNumber);
                }
            }
        }
    }
}

