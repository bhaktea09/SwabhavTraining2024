package com.techlabs.c;

import java.util.Scanner;

public class FactorialCalculator {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number");
	int number = scanner.nextInt();
	int factorial= calculateFactorial(number);
	System.out.println("cannot return factorial of negatives :");
	System.out.println(factorial);

}
	private static int calculateFactorial(int number){
		if(number == 0)
			return 1;
		if (number<0)
			return -1;
			
		int factorial=1;
		for (int i=1;i<=number;i++)
			factorial=factorial*1;
		return factorial;
	}
	}

