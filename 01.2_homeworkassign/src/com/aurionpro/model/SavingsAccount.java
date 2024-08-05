package com.aurionpro.model;

public class SavingsAccount extends Account {
	private double minBalance;

	public SavingsAccount(int acctnumber, String name, double balance, double minBalance) {
		super(acctnumber, name, balance);
		this.minBalance=minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", getMinBalance()=" + getMinBalance()
				+ ", getAcctnumber()=" + getAcctnumber() + ", getName()=" + getName() + ", getBalance()=" + getBalance()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
