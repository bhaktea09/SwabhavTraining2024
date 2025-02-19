package com.techlabs.model;

import java.util.Scanner;

public class TicTacToeFacade {
	private TicTacToeGame game;

	public TicTacToeFacade() {
		game = new TicTacToeGame();
	}

	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		while (!game.isGameOver()) {
		game.printBoard();
		System.out.println("Enter row and column: ");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		game.play(row, col);
		}
		game.printBoard();
		
		System.out.println("Game Over!");
	}
}
