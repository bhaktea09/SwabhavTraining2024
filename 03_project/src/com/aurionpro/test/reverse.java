package com.aurionpro.test;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		int rev =0;
		int temp = number;
		
		while ( number > 0) {
				int remainder = number % 10;
				rev = (rev*10) + remainder;
				number = number / 10;	
	}
       System.out.println( "reverse" + rev);
	}}
