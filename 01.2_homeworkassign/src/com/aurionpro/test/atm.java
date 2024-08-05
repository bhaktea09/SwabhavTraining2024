package com.aurionpro.test;
import java.util.*;

public class atm {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int balance = 1000 ;
	        int option;
	        
	        while (true) {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Please choose an option: ");
	            option = scanner.nextInt();
	            
	            switch (option) {
	                case 1:
	                    System.out.printf("Your current balance is: " +balance);
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    balance += depositAmount;
	                    System.out.printf("You have deposited  . Your new balance is "+ depositAmount, balance);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    if (withdrawAmount <= balance) {
	                        balance -= withdrawAmount;
	                        System.out.printf("You have withdrawn . Your new balance is " +withdrawAmount+ balance);
	                    } else {
	                        System.out.println("Insufficient balance.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Thank you");
	                    scanner.close();
	                    return; // exit the loop and end the program
	                default:
	                    System.out.println("Invalid input");
	                    break;
	            }
	    }
	
	}

}
