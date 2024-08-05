package com.aurionpro.test;

import java.util.Scanner;

public class palindromChecker {

		public static void main(String[] args) {
			Scanner sc =  new Scanner(System.in);
			int number = sc.nextInt();
			int rev =0;
			int temp = number;
			
			while ( number > 0) {
				int remainder = number % 10;
				rev = (rev*10) + remainder;
				number = number / 10;	
	
		if ( rev == temp ) {
			System.out.println("palindrom ");
		}else {
			System.out.println(" not palindrom");
			}
}
	}