package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.model.*;

public class CalculatorTest { 
	public static void main(String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(" enter number1 :");
		int a = sc.nextInt();
		System.out.println(" enter number2 :");
		int b = sc.nextInt();
		 System.out.println(" enter number3 :");
			int c = sc.nextInt();
			System.out.println(" enter number4 :");
			int d = sc.nextInt();
			int result1 ;
		
		
		int sum = add(c, d);
		System.out.println("Addition is" +sum);
	
		int sub = sub(a, b);
		System.out.println("subtraction is"+sub);
	
		int mul = mul(c, d);
		System.out.println("Miltiplication is"+mul);
	
		int div = div(a, b);
		System.out.println("Division is"+div);
	}

	private static int div(int a, int b) {
	    result1 = div(a, b);
        result1 = mul(result1*b ) ;
		return result1 * b ;
	}
	private static int mul(int i) {
		return 0;
	}
	}
	private static int sub(int a, int b) {
		 result1 = add(c, d);
		 rsult1 = sub(result1- b);
	   	return result1-b ;

	int add(int c, int d) {
		return c+d;
	}
}
	}
	
	
	
	long b = (long) (10 + 10.5);
	 byte a = (byte) (b + 10 + 10.5);