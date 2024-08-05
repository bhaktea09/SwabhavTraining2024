package com.aurionpro.test;

import java.util.Scanner;

public class arithmeticoperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2;
		System.out.println("Enter two numbers :");
		int number1 = sc.nextInt( );
		int number2 = sc.nextInt( );
		
		//addition
		int add = number1+number2 ;
		System.out.println("sum of " +number1+ " & " +number2+ " is " +add);
		
		// subtraction
		int sub = number1-number2 ;
		System.out.println("diff of " +number1+ " & " +number2+ " is " +sub);

		//division
		int div = number1/number2 ;
		System.out.println("div of " +number1+ " & " +number2+ " is " +div);
		
		//multiplication
		int mul = number1*number2 ;
		System.out.println("mul of " +number1+ " & " +number2+ " is " +mul);
		
		//modulus
		int mod = number1*number2 ;
		System.out.println("mod of " +number1+ " & " +number2+ " is " +mod);
		
		//increment ++b -->b=b+1 prefix
		int prefix = ++number1 ;
		System.out.println("prefix of " +number1+ " is " +prefix);
	
		//decrement a-- -->a=a-1 postfix
		int postfix = number2++;
		System.out.println("postfix of " +number1+ " is " +postfix);
	
		

	}

}
