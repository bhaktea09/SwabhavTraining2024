package com.aurionpro.test;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character:");
		char x = sc.next().charAt(0);

		switch (x) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(x + " is a vowel.");
			break;
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(x + " is a vowel.");
			break;
		default:
			System.out.println(x + " is not a vowel.");
			break;
		}
	}
}
