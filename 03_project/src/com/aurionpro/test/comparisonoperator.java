package com.aurionpro.test;

import java.util.Scanner;

public class comparisonoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
		
		//equalto == compare
        if (a==b) {
		System.out.println(a +" is equal to "+ b);
        }
		
		//notequal
        if (a!=b) {
		System.out.println(a +" is not equal to "+ b);
	    }
		
		//lesserthan
        if (a<b) {
		System.out.println(a +" is less than "+ b);
        }
		
		//greaterthan
        if (a>b) {
		System.out.println(a +" is greater than "+ b);
        }
		
		//less than and equal to
        if (a<=b) {
		System.out.println(a +" is less than and equal to "+ b);
        }
        
		//greater than and equal to
        if (a>=b) {
		System.out.println(a +" is greater than and equal to "+ b);
        }
	}

}
