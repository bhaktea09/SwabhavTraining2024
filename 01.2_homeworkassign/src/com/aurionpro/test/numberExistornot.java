package com.aurionpro.test;
import java.util.Scanner;
public class numberExistornot {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the size of the array: ");
	        int n = scanner.nextInt();  
	        
	        int[] array = new int[n]; 
	        
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();  
	        }
	        
	        System.out.println("Enter the number to check: ");
	        int numberToCheck = scanner.nextInt(); 
	        
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (array[i] == numberToCheck) {
	                found = true;
	                break;
	            }
	        }
	        
	        if (found) {
	            System.out.println(numberToCheck + " exists in the array.");
	        } else {
	            System.out.println(numberToCheck + " does not exist in the array.");
	        }


	}

}
