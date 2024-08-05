package com.techlabs.creational.factory.model;

public class Savingsaccount implements IAccount {
	private int accountnumber;
	private int balance;
	private String Accounttype;
	int amount;

	public Savingsaccount(int accountnumber, int balance, int amount) {
		super();
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.amount = amount;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	private double minBalance;

	public void SavingsAccount(int acctnumber, double minBalance, String accounttype) {
		this.minBalance = minBalance;
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		if (amount > balance) {
			System.out.println("insufficient balance");
		} else {
			balance -= amount;
		}
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}

}
