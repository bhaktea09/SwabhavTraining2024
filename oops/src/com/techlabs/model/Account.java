package com.techlabs.model;

public class Account {
	    private int accountNumber;
	    private String name;
	    private double balance;
	    private String accountType;

	    public Account(int accountNumber, String name, double balance, String accountType) {
	        this.accountNumber = accountNumber;
	        this.name = name;
	        this.balance = balance;
	        this.accountType = accountType;
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

	    public String getAccountType() {
	        return accountType;
	    }

	    public void setAccountType(String accountType) {
	        this.accountType = accountType;
	    }

	   //deposit
	    public void credit(double amount) {
	       balance +=amount;
	    }

	    // withdrawal
	    public void debit(double amount) {
	      if (amount <= balance)
	      {
	    	  balance -= amount;
	      }else
	    	  System.out.println("insufficient balance :");
	    }

	    public void displayDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Name: " + name);
	        System.out.println("Balance: " + balance);
	        System.out.println("accountType " + accountType);
	    }
	}

	
	
	
	

