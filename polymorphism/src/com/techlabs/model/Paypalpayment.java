package com.techlabs.model;

public class Paypalpayment extends Payment {
	@Override 
	public void paybills() {
		System.out.println("the payment was through Paypalpayment:");
	}
	@Override
	public void redeem() {
		System.out.println("redeemed by Paypalpayment:");
	}
}
