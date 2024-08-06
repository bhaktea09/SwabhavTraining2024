package com.techlabs.model;

public class AccountC implements Comparable<AccountC> {
    private int accountNumber;
    private String name;
    private int balance;

    public AccountC(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int compareTo(AccountC other) {
        return Integer.compare(this.balance, other.balance);
    }

    @Override
    public String toString() {
        return "AccountC{" +
               "accountNumber=" + accountNumber +
               ", name='" + name + '\'' +
               ", balance=" + balance +
               '}';
    }
}
