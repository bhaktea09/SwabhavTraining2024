package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.Account;

public class BankAcctHwTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of accounts to create: ");
        int n = scanner.nextInt();
        
        
        Account[] bank = new Account[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Account Number: ");
            int accountNumber = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Account Type: ");
            String accountType = scanner.next(); 
            
            bank[i] = new Account(accountNumber, name, balance, accountType);
            System.out.println("Account created successfully.");
        }
        
        
        Account maxbalanceAccount = getMaximumBalanceAccount(bank);
        if (maxbalanceAccount != null) {
            System.out.println("Account with maximum balance:");
            maxbalanceAccount.displayDetails();
        } else {
            System.out.println("No accounts found.");
        }
      
        
    }

  //account is the class name , getmaximumbalance is method , account[] accounts is array .
    public static Account getMaximumBalanceAccount(Account[] accounts) {
        if (accounts.length == 0) {
            return null;
        }

       Account maxbalanceAccount = accounts [0]; // initializing thr account as 0
       for(int i=0; i< accounts.length; i++)
       {
    	   if(accounts[i].getBalance()  > maxbalanceAccount.getBalance()) {
    		   maxbalanceAccount = accounts[i];
    	   }
       }
       return maxbalanceAccount;
    }
}

