package com.aurionpro.test;

public class argsSimpleInterest {

	public static void main(String[] args) {
		int PrincipleAmount = Integer.parseInt(args[0]);
		int RateofInterest = Integer.parseInt(args[1]);
		int Numberofyears = Integer.parseInt(args[2]);
		
		double SimpleInterest = PrincipleAmount * RateofInterest * Numberofyears;
		System.out.println("The simpleinterest is " +SimpleInterest);
	}

}
