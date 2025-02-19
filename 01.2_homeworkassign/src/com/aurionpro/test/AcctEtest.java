package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.exceptions.OverdraftLimitExceededException;
import com.aurionpro.model.AcctE;

public class AcctEtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter bank account number:");
        int accountnumber = scanner.nextInt();

        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter balance:");
        int balance = scanner.nextInt();

        AcctE account = new AcctE(accountnumber, name, balance);

        int option;
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Credit money");
            System.out.println("3. Debit Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your current balance is: "+ account.getBalance());
                   
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double creditAmount = scanner.nextDouble();
                    try {
                        account.credit(creditAmount);
                        System.out.println("Deposited: " + creditAmount);
                    } catch (MinimumBalanceException e) {
                        System.out.println("Error: Minimum balance");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double debitAmount = scanner.nextDouble();
                    try {
                        account.debit(debitAmount);
                        System.out.println("Withdrawn: " + debitAmount);
                    } catch (OverdraftLimitExceededException e) {
                        System.out.println("Error: Overdraft limit exceeded");
                    } 
                    break;
                case 4:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
