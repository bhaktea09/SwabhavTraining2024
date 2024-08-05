package com.techlabs.test;

import com.techlabs.model.BankAccount;

public abstract class TestBankAccount {

	public static void main(String[] args) {
		  
        BankAccount account1 = new BankAccount(123456, "Alice", 1000);
        BankAccount account2 = new BankAccount(789012, "Bob", 2000);

        
        System.out.println("Details of Account 1:");
        account1.displayDetails();
        System.out.println();

        account1.deposit(500);
        account1.withdraw(200);
        account1.withdraw(1500);  
        account1.deposit(-100);   
        account1.withdraw(0);     
        System.out.println();

       
        System.out.println("Updated Details of Account 1:");
        account1.displayDetails();
        System.out.println();

        
        System.out.println("Details of Account 2:");
        account2.displayDetails();
        System.out.println();

        
        account2.deposit(1000);
        account2.withdraw(2500);  
        account2.withdraw(300);
        System.out.println();

        
        System.out.println("Updated Details of Account 2:");
        account2.displayDetails();
    }
	}
