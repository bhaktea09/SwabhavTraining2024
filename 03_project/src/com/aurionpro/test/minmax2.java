package com.aurionpro.test;

import java.util.Scanner;

public class minmax2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2;
		System.out.println("Enter two numbers :");
		int x = sc.nextInt( );
		int y = sc.nextInt();
		
		if (x > y) {
			System.out.println( "enter x is maximum");
		}
		else {
			System.out.println( " enter y is maximum");
		}
	}
	

}
