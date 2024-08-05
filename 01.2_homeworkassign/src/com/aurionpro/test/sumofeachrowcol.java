package com.aurionpro.test;

import java.util.Scanner;

public class sumofeachrowcol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int [][] a = new int [n][n] ;
        int [][] b = new int [n][n];
        int sum = 0;
        int i = 0;
        int j=0;      
        System.out.println("Enter the rows :");
        for (int  i1 = 0; i1 < n; i1++) { //rows
			a[i1][j] = sc.nextInt();
        	sum += a[i1][j];
        }
        	System.out.println(" sum of rows :" + sum);
	  
        	 System.out.println("Enter the colums :");
            for (int j1 = 0; j1 < n; j1++) { //columns
                b[i][j1] = sc.nextInt(); 
    			sum +=  b[i][j1];
            }
        
        System.out.println(" sum of cols:" + sum);

	}
}
