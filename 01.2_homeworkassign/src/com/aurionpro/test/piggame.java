package com.aurionpro.test;
import java.util.*;
public class piggame {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        int playerScore = 0;
	        int turnScore = 0;
	        boolean playerTurn = true;

	        System.out.println("Let's Play PIG!");

	        while (playerScore < 100) {
	            System.out.println("\nCurrent score: " + playerScore);

	            if (playerTurn) {
	                System.out.println("Roll(r) or hold(h)? ");
	                char choice = sc.next().charAt(0);

	                if (choice == 'r') {
	                    int die = random.nextInt(6) + 1;
	                    System.out.println("You rolled: " + die);

	                    if (die == 1) {
	                        System.out.println("You rolled a 1. Turn score reset to 0.");
	                        turnScore = 0;
	                        playerTurn = false;
	                    } else {
	                        turnScore += die;
	                        System.out.println("Turn score: " + turnScore);
	                    }
	                } else if (choice == 'h') {
	                    playerScore += turnScore;
	                    System.out.println("You hold. Total score now: " + playerScore);
	                    turnScore = 0;
	                    playerTurn = false; 
	                } else {
	                    System.out.println("Invalid input. Please try again.");
	                }
	            } else {
	                playerTurn = true;
	            }
	        }

	        System.out.println("\nFinal score: " + playerScore);
	        System.out.println("Congratulations! You win!");

	}
}

