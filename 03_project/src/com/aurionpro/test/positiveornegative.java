package com.aurionpro.test;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class positiveornegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2;
		System.out.println("Enter two numbers :");
		int x = sc.nextInt( );
		
		if ( x == 0) {
			System.out.println("Entered number is zero");
		}
		else if (x > 0) {
			System.out.println( "Entered number is positiveE");
		}
		else if (x < 0 ){
			System.out.println( "Entered number is negative");
		}
	}

}
