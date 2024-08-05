package com.aurionpro.test;

import java.util.Scanner;

public class maxElementsOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers :");
		int size = sc.nextInt();
		int array[] = new int [size];
		int max = 0 ;
		

		System.out.println(" input numbers ");
		 for (int i =0; i <= size; i++) {
			 array[i]= sc.nextInt();
			 if(array[i] > max) {
				 max = array[i];
			 } 
			 }
			 System.out.println("max element of array" +max);
		
	}

}
