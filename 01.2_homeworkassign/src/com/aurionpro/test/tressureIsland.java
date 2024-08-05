package com.aurionpro.test;
import java.util.*;
public class tressureIsland {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Treasure Island");
	        
	        System.out.println("left or right?");
	        String choice1 = scanner.nextLine();

	        if (choice1.equalsIgnoreCase("left")) {
	            System.out.println("swim or wait?");
	            String choice2 = scanner.nextLine();
	            
	            if (choice2.equalsIgnoreCase("wait")) {
	                System.out.println("Which door? Red, Blue, or Yellow?");
	                String choice3 = scanner.nextLine();
	                
	                if (choice3.equalsIgnoreCase("Yellow")) {
	                    System.out.println("You Win!");
	                } else if (choice3.equalsIgnoreCase("Red")) {
	                    System.out.println("Burned by fire. Game Over.");
	                } else if (choice3.equalsIgnoreCase("Blue")) {
	                    System.out.println("Eaten by beasts. Game Over.");
	                } else {
	                    System.out.println("Game Over.");
	                }
	                
	            } else {
	                System.out.println("Attacked by trout. Game Over.");
	            }
	            
	        } else {
	            System.out.println("Fall into a hole. Game Over.");
	        }
	}
}
