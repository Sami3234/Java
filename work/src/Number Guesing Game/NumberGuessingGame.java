import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Choose difficulty level:");
        System.out.println("1. Easy (1-10)");
        System.out.println("2. Medium (1-50)");
        System.out.println("3. Hard (1-100)");
        
        int choice = scanner.nextInt();
        int maxNumber = 0;
        int maxAttempts = 0;
        
        switch(choice) {
            case 1:
                maxNumber = 10;
                maxAttempts = 5;
                break;
            case 2:
                maxNumber = 50;
                maxAttempts = 7;
                break;
            case 3:
                maxNumber = 100;
                maxAttempts = 10;
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Easy mode.");
                maxNumber = 10;
                maxAttempts = 5;
        }
        
        int targetNumber = random.nextInt(maxNumber) + 1;
        int[] guesses = new int[maxAttempts];
        int attempts = 0;
        boolean hasWon = false;
        
        System.out.println("I'm thinking of a number between 1 and " + maxNumber);
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        
        while(attempts < maxAttempts && !hasWon) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if(guess < 1 || guess > maxNumber) {
                System.out.println("Please enter a number between 1 and " + maxNumber);
                continue;
            }
            
            guesses[attempts] = guess;
            attempts++;
            
            if(guess == targetNumber) {
                hasWon = true;
                System.out.println("Congratulations! You guessed the number!");
            } else if(guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            
            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
        }
        
        displayGameSummary(hasWon, targetNumber, attempts, guesses);
        scanner.close();
    }
    
    public static void displayGameSummary(boolean hasWon, int targetNumber, int attempts, int[] guesses) {
        System.out.println("\nGame Summary:");
        System.out.println("Target number was: " + targetNumber);
        System.out.println("Total attempts used: " + attempts);
        
        if(hasWon) {
            System.out.println("Result: You won!");
        } else {
            System.out.println("Result: Game Over!");
        }
        
        System.out.println("\nYour guesses:");
        for(int i = 0; i < attempts; i++) {
            System.out.println("Attempt " + (i + 1) + ": " + guesses[i]);
        }
    }
} 