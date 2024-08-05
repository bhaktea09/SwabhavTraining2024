package com.techlabs.creational.factory.test;

import java.util.Scanner;

import com.techlabs.creational.factory.model.Currentaccount;
import com.techlabs.creational.factory.model.Savingsaccount;

public class Accounttest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savingsaccount savingsaccount = new Savingsaccount(0, 0, 0);
		Currentaccount currentaccount = new Currentaccount();
		
		savingsaccount.credit();
		savingsaccount.debit();
		
		currentaccount.credit();
		currentaccount.debit();
	}
}
