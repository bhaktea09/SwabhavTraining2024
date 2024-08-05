package com.aurionpro.test;

import java.util.Scanner;
public class logicaloperators {
   public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Enter the first number : ");
       int a = sc.nextInt();
       System.out.println("Enter the second number : ");
       int b = sc.nextInt();
       System.out.println("Enter the third number : ");
       int c = sc.nextInt();
			
		System.out.println(a==b && a==c);
		System.out.println(a==b || a==c);
		System.out.println(!(a==b || a==c));
				
	}
}
//used when multiple conditions are used to check -- && both true
//|| atleast one true
//!chnage t--f