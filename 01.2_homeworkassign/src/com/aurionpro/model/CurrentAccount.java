package com.aurionpro.model;

public class CurrentAccount extends Account {
	private double overdraftlimit;

	public CurrentAccount(int acctnumber, String name, double balance,  double overdraftlimit) {
		super(acctnumber, name, balance);
		this.overdraftlimit=overdraftlimit;
	}

	public double getOverdraftlimit() {
		return overdraftlimit;
	}

	public void setOverdraftlimit(double overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraftlimit=" + overdraftlimit + ", getOverdraftlimit()=" + getOverdraftlimit()
				+ ", getAcctnumber()=" + getAcctnumber() + ", getName()=" + getName() + ", getBalance()=" + getBalance()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
		
	
	
	
	
	
	
}
