package com.aurionpro.test;
import java.util.*;
public class primenumbers {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of lines: ");
	        int numLines = sc.nextInt();

	        int currentPrime = 2;

	        for (int line = 1; line <= numLines; line++) {
	            for (int position = 1; position <= line; position++) {
	                System.out.print(currentPrime + "    ");
	                do {
	                    currentPrime++;
	                } while (!isPrime(currentPrime)); 
	            }
	            System.out.println(); 
	        }
	    }

	    public static boolean isPrime(int num) {
	        if (num < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

}
