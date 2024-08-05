package com.aurionpro.test;

import java.util.Scanner;

public class maxof3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three numbers :");
		int x = sc.nextInt( );
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x > y && x > z) {
			System.out.println(" enter x is maximum");
		}
		else if ( y > z && y > x) {
			System.out.println( "enter y is maximum ");
		}
		
		else {
			System.out.println( " enter z " +z);
		}
	}

}
