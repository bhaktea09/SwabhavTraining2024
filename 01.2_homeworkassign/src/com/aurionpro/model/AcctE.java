package com.aurionpro.model;

import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.exceptions.OverdraftLimitExceededException;

public class AcctE  {

	private int accountnumber;
	private String name;
	private int balance;
	
	public AcctE(int accounttnumber, String name, int balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void credit(double amount) {
		if (amount > balance)
		throw new MinimumBalanceException();
		else {
			balance += amount;
		}
	}
	public void debit(double amount)  {
		if (amount > balance)
		throw new OverdraftLimitExceededException();
		 else {
			balance -= amount;
		}
		}
	
	@Override
	public String toString() {
		return "AcctE [acctnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + ", getAcctnumber()="
				+ getAccountnumber() + ", getName()=" + getName() + ", getBalance()=" + getBalance() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
