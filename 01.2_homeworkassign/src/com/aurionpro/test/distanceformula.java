//Write a program that calculates the distance between two points (x1, y1)
//and (x2, y2) using the distance formula.

package com.aurionpro.test;
import java.util.*;
	public class distanceformula {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double x1 = sc.nextDouble();
			System.out.println("Enter x1");
			
			double y1 = sc.nextDouble();
			System.out.println("Enter y1");
			
			double x2 = sc.nextDouble();
			System.out.println("Enter x2");
			
			double y2 = sc.nextDouble();
			System.out.println("Enter y2");
			
			//distance formula
			double distanceBetweenPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			  System.out.println("Distance between two points is : " + distanceBetweenPoints);	}

}
