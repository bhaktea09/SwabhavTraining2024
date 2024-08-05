package com.aurionpro.test;
import java.util.*;
public class findduplicates {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the size of the array: ");
	        int n = scanner.nextInt();  // Read the size of the array
	        
	        int[] array = new int[n];  // Create an array of size n
	        
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();  // Read each element of the array
	        }
	        
	        Map<Integer, Integer> elementCountMap = new HashMap<>();  // Create a HashMap to store the count of each element
	        
	        for (int i = 0; i < n; i++) {
	            int element = array[i];
	            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);  // Increment the count of the element in the map
	        }
	        
	        int duplicateCount = 0;
	        for (int count : elementCountMap.values()) {
	            if (count > 1) {
	                duplicateCount++;  // Count elements that appear more than once
	            }
	        }
	        
	        System.out.println("Number of duplicate elements: " + duplicateCount);
	        

	}

}
