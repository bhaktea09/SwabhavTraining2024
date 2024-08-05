package com.aurionpro.test;

import java.util.Scanner;

public class currency {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the amount ");
		int amt = sc.nextInt();
		int num_of_2000 = 0;
		int num_of_500 = 0 ;
		int num_of_200 = 0;
		int num_of_100 = 0;
		
		if (amt > 50000) {
			System.out.println(" withdrawal limit ");
			}
		else if ( amt % 100 != 0) {
			System.out.println(" amt should be in multiples of 100");
			}
		else {
			num_of_2000 = amt / 2000 ;
		    amt = amt % 2000;
		    if (num_of_2000!= 0)
	    	System.out.println( " Two Thousand :" + num_of_2000 );
		
		   num_of_500 = amt / 500 ;
		   amt = amt % 500;
		   if ( num_of_500  != 0)
		   System.out.println( "Five Hundred :" + num_of_500);
	    
		   num_of_200 = amt / 200 ;
		   amt = amt % 200;
		   if (num_of_200 != 0)
		   System.out.println( "Two Hundred" + num_of_200 );
	    
		   num_of_100 = amt / 100 ;
		   amt = amt % 100;
		   if (num_of_100 != 0)
		   System.out.println( " One Hundred" + num_of_100);

			
		}

	}

}
