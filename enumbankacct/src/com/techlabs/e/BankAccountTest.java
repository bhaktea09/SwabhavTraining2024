package com.techlabs.e;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(10001,"bhakti",12345670,AccountType.savings);
		
		System.out.println(account);
	}

}
