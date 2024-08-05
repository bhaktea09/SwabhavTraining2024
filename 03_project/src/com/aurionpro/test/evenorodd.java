package com.aurionpro.test;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2;
		System.out.println("Enter two numbers :");
		int x = sc.nextInt( );
	
        if (x % 2 == 0) {
        	System.out.println(" Entered number is even : ");
        }
        	else 
        		System.out.println("Entered number is odd");
        }
	}


