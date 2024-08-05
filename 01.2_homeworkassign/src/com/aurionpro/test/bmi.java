//Write a program that calculates the Body Mass Index (BMI) based on user input for weight (in kilograms) 
//and height (in meters).


package com.aurionpro.test;
import java.util.*;
	public class bmi {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Input weight in kilograms :");
			double weight = sc.nextDouble();
			
			System.out.println(" Input height in meter :");
			double height  = sc.nextDouble();
			
			//formula
			double bmi = weight / (height * height) ;
			System.out.println( " The Body Index Mass is :" +bmi+ "kg/m2");
			

	}

}
