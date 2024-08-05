package com.aurionpro.h;

import java.util.Scanner;

public class patternsthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter rows: ");
	      int rows = sc.nextInt();
	      int k = 1;
	     
	     
	      
	      for ( int i = 0; i <= rows ; i++ ) {
	    	 for ( int j = 0; j <= i ; j++) {
	    	  System.out.print( i );
	      }
	    	System.out.println();
	      }
		

	}

}
