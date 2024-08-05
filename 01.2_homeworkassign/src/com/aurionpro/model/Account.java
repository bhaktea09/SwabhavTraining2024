package com.aurionpro.model;

public class Account {
	private int acctnumber;
	private String name;
	private double balance;
	
	public Account(int acctnumber,String name, double balance) {
		super();
		this.acctnumber=acctnumber;
		this.name=name;
		this.balance=balance;
	
	}
	
	public int getAcctnumber() {
		return acctnumber;
	}
	public void setAcctnumber(int acctnumber) {
		this.acctnumber = acctnumber;
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
	@Override
	public String toString() {
		return "Account [acctnumber=" + acctnumber + ", name=" + name + ", balance=" + balance + ", getAcctnumber()="
				+ getAcctnumber() + ", getName()=" + getName() + ", getBalance()=" + getBalance() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
