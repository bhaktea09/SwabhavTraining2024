package com.aurionpro.b;
import java.util.*;
public class twodimensionala {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter number of rows");
	int rows  = sc.nextInt();
	System.out.println(" enter number of cols");
	int cols = sc.nextInt();
	
	System.out.println(" enter the matrix");
	int [][] numbers = new int [rows][cols];
	
	//input
	//rows
	for(int i1= 0; i1 < rows ;i1++) {
		//columns
		for(int j=0; j<cols ; j++ ) {
			numbers[i1][j]=sc.nextInt();
			
			System.out.print( numbers[i1][j]+ " " );
		}
		
	}
	
			
       System.out.println();
}
}