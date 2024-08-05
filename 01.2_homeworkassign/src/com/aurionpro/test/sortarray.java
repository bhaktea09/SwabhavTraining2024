package com.aurionpro.test;
import java.util.*;
public class sortarray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the size of the array: ");
	        int n = scanner.nextInt();  
	        
	        int[] array = new int[n];  
	        
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();  
	        }
	        
	        Arrays.sort(array);  
	        
	        System.out.println("Sorted array: " + Arrays.toString(array));
	}

}
