package com.aurionpro.test;
import java.util.*;

public class simpleInterestCalculator {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner (System.in);
		System.out.println(" Enter the Principle Amount :");
		int PrincipleAmount = sc1.nextInt( );
		
		Scanner sc2 = new Scanner (System.in);
		System.out.println(" Enter Rate of Interest :");
		double RateofInterest = sc2.nextDouble();
		
		Scanner sc3 = new Scanner (System.in);
		System.out.println(" Enter Number of years from users :");
		int  Numberofyear = sc3.nextInt( );

		double simpleinterest = (PrincipleAmount * RateofInterest * Numberofyear)/100;
		
		System.out.println("Simpleinterest is " + simpleinterest);
	}

}
