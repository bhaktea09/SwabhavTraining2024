package com.techlabs.model;

public class TicTacToeGame implements ITictactoe {
	private char[][] board;
	private char currentPlayer;

	public TicTacToeGame() {
		board = new char[3][3];
		currentPlayer = 'X';
		initializeBoard();
	}

	private void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}

	@Override
	public void play(int x, int y) {
		if (board[x][y] == '-') {
			board[x][y] = currentPlayer;
			if (currentPlayer == 'X')
				currentPlayer = 'O';
			else
				currentPlayer = 'X';
		}
	}

	@Override
	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Override
	public boolean isGameOver() {
		return checkRows() || checkColumns() || checkDiagonals();
	}

	private boolean checkRows() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
				return true;
			}
		}
		return false;
	}

	private boolean checkColumns() {
		for (int i = 0; i < 3; i++) {
			if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
				return true;
			}
		}
		return false;
	}

	private boolean checkDiagonals() {
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
			return true;
		}
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
			return true;
		}
		return false;
	}
}
