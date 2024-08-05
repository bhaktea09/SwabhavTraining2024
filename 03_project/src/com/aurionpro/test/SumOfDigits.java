package com.aurionpro.test;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		
		while (number > 0) {
			int remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}
		 System.out.println(sum);
	}

}
