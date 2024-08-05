package com.aurionpro.test;
import java.util.Scanner;

	public class interchange {
		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter number1 :");
		int number1 = sc.nextInt( );
		
		System.out.println(" Enter number2 :");
		 int number2 = sc.nextInt( );
		 
		 int temp = number2;
		 number2 = number1;
		 number1 = temp;
		 
		 System.out.println(" After swapping number1 is temp now : " +number1+ " number 2 is now  :" +number2);
		}}
