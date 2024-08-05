package com.aurionpro.test;
import java.util.*;
public class numberguesser {

	 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        boolean playAgain = true;

		        while (playAgain) {
		            int numberToGuess = random.nextInt(100) + 1;
		            int numberOfTries = 0;
		            boolean hasGuessedCorrectly = false;
		            final int MAX_ATTEMPTS = 5;
		            System.out.println("Random number generated: " + numberToGuess); 
		            
		            while (!hasGuessedCorrectly && numberOfTries < MAX_ATTEMPTS) {
		                System.out.print("Guess a number? ");
		                int userGuess = scanner.nextInt();
		                numberOfTries++;

		                if (userGuess < numberToGuess) {
		                    System.out.println("Sorry, too low.");
		                } else if (userGuess > numberToGuess) {
		                    System.out.println("Sorry, too high.");
		                } else {
		                    hasGuessedCorrectly = true;
		                    System.out.println("won in attempt: " + numberOfTries);
		                }
		            }

		            if (!hasGuessedCorrectly) {
		                System.out.println("reached the maximum attempts: " + numberToGuess);
		            }

		            System.out.print("Do you want to play? (yes/no): ");
		            
		        }

		        System.out.println("Thank you");
		        
		    }
}