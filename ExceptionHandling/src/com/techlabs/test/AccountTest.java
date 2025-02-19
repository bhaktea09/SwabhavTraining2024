package com.techlabs.test;

import java.util.Scanner;


import com.techlabs.exceptions.InsufficientBalanceException;
import com.techlabs.model.Account;

public class AccountTest extends RuntimeException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println(" enter bank account number :");
			String accountnumber = scanner.next();

			System.out.println(" enter name :");
			String name = scanner.next();

			System.out.println(" enter balance:");

			double balance = scanner.nextDouble();
			Account account = null;

			Account account1 = new Account(accountnumber, name, balance);

			boolean exit = false;
			while (!exit) {
				System.out.println("Choose an operation:");
				System.out.println("1. Credit");
				System.out.println("2. Debit");
				System.out.println("3. Display balance");
				System.out.println("4. Exit");

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter amount to credit: ");
					double credamt = scanner.nextDouble();
					account1.credit(credamt);
					System.out.println("Amount credited successfully.");
					break;
					
				case 2:
					System.out.print("Enter amount to debit: ");
					double debitAmount = scanner.nextDouble();
					try {
						account1.debit(debitAmount);
						System.out.println("Amount debited successfully.");
					} catch (InsufficientBalanceException e) {
						System.out.println("Error: Insufficient balance");
					}
					break;
				case 3:
					System.out.println("Current balance: "+ balance );
					break;
				case 4:
					exit=true;
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					break;
				}
			}
		}
	}

