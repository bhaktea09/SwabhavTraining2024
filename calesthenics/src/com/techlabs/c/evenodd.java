package com.techlabs.c;
import java.util.*;
public class evenodd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int number = scanner.nextInt();
		
		if (number%2==0)
			{
			System.out.println("even");
				return;
			}
		System.out.println("odd");
	}

}
