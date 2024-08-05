package com.aurionpro.test;

import java.util.Scanner;

public class matrixmul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of squared matrices");
        int n = sc.nextInt();
		int [][] a = new int [n][n] ;
        int [][] b = new int [n][n];
        int [][] c = new int[n][n];
        
        System.out.println("Enter the elements of first matrix :");
        for (int  i = 0; i < n; i++) { //rows
            for (int j = 0; j < n; j++) { //columns
                a [i][j] = sc.nextInt(); //rowxcol
            }
        }
        System.out.println("Enter the elements of second matrix :");
        for (int  i = 0; i < n; i++) { //rows
            for (int j = 0; j < n; j++) { //columns
                b [i][j] = sc.nextInt(); //rows x columns
	}
}
        System.out.println("multiplying the matrix :");
        for (int  i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
               for ( int k=0; k<n; k++ ) {
            	   c [i][j] = c [i][j] + a [i][j] * b [i][j];
            	   
               }
            }
        }
         System.out.println("The product is:");
          for (int i = 0; i < n; i++)
                   {
           for (int j = 0; j < n; j++) {
        	   System.out.print(c[i][j] + " ");
               }
            }
            System.out.println();
 
	}
            
}
                
                
                
                
                