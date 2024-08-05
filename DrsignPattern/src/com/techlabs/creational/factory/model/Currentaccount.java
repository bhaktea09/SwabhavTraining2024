package com.techlabs.creational.factory.model;

public class Currentaccount implements IAccount{
	private int accountnumber;
	private int amount;
	private int balance;

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		balance += amount;
	System.out.println("amount is creditted" + balance);
			
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		if(amount > balance) {
			System.out.println("insufficient balance");
		}else {
			balance -= amount;
		}
	}

}
