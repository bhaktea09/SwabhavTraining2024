package com.techlabs.e;

public class BankAccount {
	 private int accountNumber;
	    private String name;
	    private double balance;
	    private AccountType accountType;
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public AccountType getAccountType() {
			return accountType;
		}
		public void setAccountType(AccountType accountType) {
			this.accountType = accountType;
		}
		@Override
		public String toString() {
			return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
					+ ", accountType=" + accountType + "]";
		}
		public BankAccount(int accountNumber, String name, double balance, AccountType accountType) {
			super();
			this.accountNumber = accountNumber;
			this.name = name;
			this.balance = balance;
			this.accountType = accountType;
		}
	
	
	
	
	
}
