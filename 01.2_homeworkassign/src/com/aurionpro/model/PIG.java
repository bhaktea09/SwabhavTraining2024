package com.aurionpro.model;

import java.util.Random;

public class PIG {
	private static final int WINNING_SCORE = 100;
	 private int playerScore;
	 private int turnScore;
	 private boolean playerTurn;
	 private Random random;

	 public PIG() {
	  playerScore = 0;
	  turnScore = 0;
	  playerTurn = true;
	  random = new Random();
	 }

	 public void playGame() {
	  while (playerScore < WINNING_SCORE) {
	  
	  }
	 }

	 public int rollDice() {
	  int die = random.nextInt(6) + 1;
	  if (die == 1) {
	   turnScore = 0;
	   playerTurn = false;
	  } else {
	   turnScore += die;
	  }
	  return die;
	 }

	 public void hold() {
	  playerScore += turnScore;
	  turnScore = 0;
	  playerTurn = false;
	 }

	 public int getPlayerScore() {
	  return playerScore;
	 }

	 public boolean isPlayerTurn() {
	  return playerTurn;
	 }

	 public int getTurnScore() {
	  return turnScore;
	 }
	
}
