package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;
import com.aurionpro.model.PIG;

public class PIGTest {

	
		 public static void main(String[] args) {
			  Scanner scanner = new Scanner(System.in);
			  PIG game = new PIG();

			  System.out.println("Let's Play PIG!");

			  while (game.getPlayerScore() < 20) {
			   System.out.println("\nCurrent score: " + game.getPlayerScore());
			   playTurn(scanner, game);
			  }
			  if (game.getPlayerScore() >= 20) {
			   announceWinner(game.getPlayerScore());
			  }

			 }

			 private static void playTurn(Scanner scanner, PIG game) {
			  System.out.println("Roll (r) or hold (h)? ");
			  char choice = scanner.next().charAt(0);
			  processChoice(choice, game);
			 }

			 private static void processChoice(char choice, PIG game) {
			  if (choice == 'r') {
			   int die = game.rollDice();
			   handleRoll(die, game);
			  }
			  if (choice == 'h') {
			   game.hold();
			   System.out.println("Total score now: " + game.getPlayerScore());
			  }
			  if (choice != 'r' && choice != 'h') {
			   System.out.println("Invalid input. Please try again.");
			  }
			 }

			 private static void handleRoll(int die, PIG game) {
			  System.out.println("You rolled: " + die);
			  if (die == 1) {
			   System.out.println("You rolled a 1. Turn score reset to 0.");
			  }
			  System.out.println("Turn score: " + game.getTurnScore());
			 }

			 private static void announceWinner(int playerScore) {
			  System.out.println("\nFinal score: " + playerScore);
			  System.out.println("Congratulations! You win!");
			 }
}

