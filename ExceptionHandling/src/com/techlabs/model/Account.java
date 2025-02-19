package com.techlabs.model;

import com.techlabs.exceptions.InsufficientBalanceException;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;

	public Account(String accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
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

	public void credit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void debit(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException();
		} else if (amount > 0) {
			balance -= amount;
		}
	}
}
