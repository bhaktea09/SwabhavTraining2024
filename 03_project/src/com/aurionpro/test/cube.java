package com.aurionpro.test;

import java.util.Scanner;

public class cube {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		int temp = number;
		
		while ( number > 0) {
				int remainder = number % 10;
				sum = sum + (remainder*remainder*remainder);
				number = number / 10;	
		}
		
		if ( sum == temp ) {
			System.out.println(" Armstrong");
		}else {
			System.out.println(" not armstrong");
			
	}

}}
