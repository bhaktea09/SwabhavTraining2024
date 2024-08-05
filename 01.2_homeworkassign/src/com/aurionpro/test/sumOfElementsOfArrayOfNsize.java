package com.aurionpro.test;
	import java.util.*;
public class sumOfElementsOfArrayOfNsize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the required size of array :");
		int size = sc.nextInt();
		int array[] = new int [size];
		int sum = 0;
		System.out.println(" enter the elements of array one by one :");
	    
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			sum = sum + array[i];
			}
		
		System.out.println(" sum of elements of array :" + sum);
	}

}
