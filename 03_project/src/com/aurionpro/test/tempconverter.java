package com.aurionpro.test;
import java.util.*;
public class tempconverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        switch (choice) {
        case 1 : 
        	double result1 = (9/5) + 32;
        	System.out.println("the converted temperature is : " +result1);
        	break ;
        	
        case 2 : 
        	double result2 = (temperature - 32)* 5/9; 
        	System.out.println("the converted temperature is : " +result2);
        	break ;
        	
        case 3 : 
        	double result3= temperature + 273.15 ; 
        	System.out.println("the converted temperature is : " +result3);
        	break ;
        	
        case 4: 
        	double result4=  + 273.15 ; 
        	System.out.println("the converted temperature is : " +result4);
        	break ;
        
        }
	}

}
