package com.techlabs.model;

public class BankAccount {
	  private int accountNumber;
	    private String name;
	    private double balance;

	    public BankAccount(int accountNumber, String name, double balance) {
	        this.accountNumber = accountNumber;
	        this.name = name;
	        this.balance = balance;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(int accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    
	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public double getBalance() {
	        return balance;
	    }

	    
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    
	    public void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Error: Deposit amount must be positive.");
	        } else {
	            balance += amount;
	            System.out.println("Successfully deposited $" + amount);
	        }
	    }

	  
	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Error: Withdrawal amount must be positive.");
	        } else if (amount > balance) {
	            System.out.println("Error: Insufficient balance.");
	        } else {
	            balance -= amount;
	            System.out.println("Successfully withdrew " + amount);
	        }
	    }

	    public void displayDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Name: " + name);
	        System.out.println("Balance: " + balance);
	    }
}

