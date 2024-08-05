package com.aurionpro.test;

import java.util.Scanner;

public class monthnumber {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			System.out.println(" enter a month number ");
			int x = sc.nextInt();
			
			switch(x) {
			case 2:
			case 3:
			case 4:
			case 5: System.out.println(" summer");
			        break;
			        
			case 6:
			case 7:
			case 8:
			case 9: System.out.println(" monsoon ");
			       break;
			    	   
			case 10:
			case 11:
			case 12:
			case 1: System.out.println( " winter");
			       break;
			    	   
			    default: System.out.println(" invalid ");
			
	}

}
}
