package com.aurionpro.test;
import java.util.*;

public class sortedarrays {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        
	        int[] arr = new int[size];
	        System.out.println("Enter the sorted array elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }
	      
	        int[] result = sortedSquaredArray(arr);
	       
	        System.out.println("Sorted squared array:");
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	    
	    public static int[] sortedSquaredArray(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        
	        int left = 0;
	        int right = n - 1;
	        int index = n - 1; 
	        
	        while (left <= right) {
	            int leftSquare = nums[left] * nums[left];
	            int rightSquare = nums[right] * nums[right];
	            
	            if (leftSquare > rightSquare) {
	                result[index] = leftSquare;
	                left++;
	            } else {
	                result[index] = rightSquare;
	                right--;
	            }
	            index--;
	        }
	        
	        return result;
	    }	
		}
			
		
	
	
	


