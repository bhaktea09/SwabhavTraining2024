package com.aurionpro.test;

public class argsInterchange {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		 int temp = number2;
		 number2 = number1;
		 number1 = temp;
		 
		 System.out.println(" After swapping number1 is temp now : " +number1+ " number 2 is now  :" +number2);
	}

}
