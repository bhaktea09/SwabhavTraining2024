package com.aurionpro.test;
import java.util.*;

public class guesstheword {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        String[] words = {"blue", "yellow", "coffee", "game"};
        Random a = new Random();
        String word = words[a.nextInt(words.length)];
        char[] blanks = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            blanks[i] = '_';
        }        
        int lives = 6;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
           
            System.out.print("Word ");
            for (char c : blanks) {
                System.out.print( c );
            }
            System.out.println(lives);

            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    blanks[i] = guess;
                    correctGuess = true;
                }
            }
            if (!correctGuess) {
                lives--;
            }
            
            boolean allFilled = true;
            for (char c : blanks) {
                if (c == '_') {
                    allFilled = false;
                    break;
                }
            }
            if (allFilled) {
                System.out.println("You guessed the word: " + word);
                break;
            }
            if (lives == 0) {
                System.out.println("Game Over " + word);
                break;
            }
        }

		
	}
}
