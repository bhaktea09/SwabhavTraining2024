package com.techlabs.model;

public class Account {
	public int accountnumber;
	public String name;
	public int balance;
	
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
	public Account(int accountnumber, String name, int balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance
				+ ", getAccountnumber()=" + getAccountnumber() + ", getName()=" + getName() + ", getBalance()="
				+ getBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
