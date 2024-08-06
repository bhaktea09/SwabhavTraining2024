package com.techlabs.test;

import com.techlabs.model.AccountC;
import java.util.*;

public class AccountCtest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of accounts:");
        int n = scanner.nextInt();

        List<AccountC> accounts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the account number:");
            int accountNumber = scanner.nextInt();

            System.out.println("Enter the name:");
            String name = scanner.next();

            System.out.println("Enter the balance:");
            int balance = scanner.nextInt();

            accounts.add(new AccountC(accountNumber, name, balance));
        }

        // Sort accounts by balance using natural ordering
        Collections.sort(accounts);

        System.out.println("Accounts sorted by balance:");
        for (AccountC account : accounts) {
            System.out.println(account);
        }

        // Display account with maximum balance
        displayAccountWithMaxBalance(accounts);
    }

    public static void displayAccountWithMaxBalance(List<AccountC> accounts) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts to display.");
            return;
        }

        AccountC maxBalanceAccount = accounts.get(0);
        for (AccountC account : accounts) {
            if (account.getBalance() > maxBalanceAccount.getBalance()) {
                maxBalanceAccount = account;
            }
        }

        System.out.println("Account with maximum balance:");
        System.out.println(maxBalanceAccount);
    }
}
