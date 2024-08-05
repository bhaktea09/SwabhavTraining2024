package com.aurionpro.test;
import java.util.*;
public class firstsum {
	
	public static void main(String[] args) {

	Scanner sc =  new Scanner(System.in);
	int i= 0;
	int sum;
	
	int number = sc.nextInt();
	System.out.println(" enter the number ");
	
	if ( number > 0) {
		while ( i <= number )
			System.out.println("sum + " +i);
		     i++;	     
	}
		System.out.println("sum");
	}
	

}
