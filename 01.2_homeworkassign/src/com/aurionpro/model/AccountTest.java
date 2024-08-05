package com.aurionpro.model;

public class AccountTest {

	public static void main(String[] args) {
		CurrentAccount currentacct = new CurrentAccount(567,"bhakti",1200,8765);
		System.out.println(currentacct );
		
		
		SavingsAccount savingsAcc = new SavingsAccount(456,"shreya", 5000 ,9876);		
		System.out.println(savingsAcc);
	}

}
