package com.aurionpro.test;
import java.util.*;
public class peakelements {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	     
	        int[] arr = new int[size];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        List<Integer> peaks = findPeakElements(arr);
	        
	        
	        System.out.println("Peak elements in the array: " + peaks);
	    }
	    
	    public static List<Integer> findPeakElements(int[] nums) {
	        List<Integer> peaks = new ArrayList<>();
	        
	        if (nums == null || nums.length == 0) {
	            return peaks; // Return empty list if input array is empty or null
	        }
	        
	        int left = 0;
	        int right = nums.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            // Check if mid is a peak
	            if ((mid == 0 || nums[mid] >= nums[mid - 1]) &&
	                (mid == nums.length - 1 || nums[mid] >= nums[mid + 1])) {
	                peaks.add(nums[mid]);
	                // Since we need all peak elements, we continue searching both sides
	                // to find potentially more peaks
	                left = mid + 1;
	                right = mid - 1;
	            } else if (mid > 0 && nums[mid - 1] > nums[mid]) {
	                // If the left neighbor is greater, search left side
	                right = mid - 1;
	            } else {
	                // If the right neighbor is greater, search right side
	                left = mid + 1;
	            }
	        }
	        
	        return peaks;
		 
		 
		 
		 
		 
		 
	}
	
        

  
    


	}


