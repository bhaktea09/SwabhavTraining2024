package com.techlabs.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.techlabs.model.Account;

public class Accounttest {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(1, "BHAKTI", 1000));
		accounts.add(new Account(2, "PARAG", 2000));
		accounts.add(new Account(3, "SHUBHAM", 3000));
		accounts.add(new Account(4, "MITALI", 4000));
		accounts.add(new Account(5, "GAURAV", 5000));

		Optional<Account> maxAccount = accounts.stream()
				.max((a1, a2) -> Integer.compare(a1.getBalance(), a2.getBalance()));

		if (maxAccount.isPresent()) {
			System.out.println("Account with max balance: " + maxAccount.get());
		} else {
			System.out.println("No accounts found.");
		}

		// Finding account with minimum balance
		Optional<Account> minAccount = accounts.stream()
				.min((a1, a2) -> Integer.compare(a1.getBalance(), a2.getBalance()));

		if (minAccount.isPresent()) {
			System.out.println("Account with min balance: " + minAccount.get());
		} else {
			System.out.println("No accounts found.");
		}
		//greater than 6
		accounts.stream()
		.sorted()
		.filter(account -> (account.getName().length() > 6))
		.forEach((account)->System.out.println(account));
		//sum of all the balance 
		int sum= accounts.stream()
				.map((account) -> account.getBalance())
				.reduce(0, (balance1,balance2)-> balance1+balance2);
		System.out.println("sum"+sum);
	}

}
