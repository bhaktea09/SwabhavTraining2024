package com.aurionpro.test;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i = 2;
		boolean flag=false;

		while (i < number) {
			if (number % i == 0) {
				flag=true;
				break;
			}
				i++;
		}
		
		if(flag==false)
			System.out.println("Is prime");
		else
			System.out.println(" its not a prime");
		
	}
		

}
