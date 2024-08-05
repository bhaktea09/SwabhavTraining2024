package com.aurionpro.test;

import java.util.Scanner;

public class fourdigit {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		double sum=0;
		int temp = number;
		int pow = 0;
		
		while ( number > 0) {
			   pow++;
			number =  number/10;
		}
		
		while ( number > 0) {
			int remainder = number % 10;
			sum = sum + Math.pow(remainder,pow);
			number = number / 10;	
	        } 
           number = temp;
		if ( sum == temp ) {
			System.out.println(" Armstrong");
		}else {
			System.out.println(" not armstrong");
			
}}}
