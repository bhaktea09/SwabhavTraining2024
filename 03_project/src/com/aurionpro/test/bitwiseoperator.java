package com.aurionpro.test;

import java.util.Scanner;

public class bitwiseoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2;
		System.out.println("Enter two numbers :");
		int number1 = sc.nextInt( );
		int number2 = sc.nextInt( );
		
	    int bitAnd = number1&number2;
	    System.out.println("value after bit and  " +bitAnd );
	    
	    int bitor = number1|number2;
	    System.out.println("value after nit or" +bitor);
	    
	    
	    
	    
	    
	    
		
		
		
		

	}

}
