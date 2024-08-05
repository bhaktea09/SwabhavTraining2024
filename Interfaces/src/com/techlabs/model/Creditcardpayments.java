package com.techlabs.model;

public class Creditcardpayments implements Payment{

	@Override
	public void paybills() {
		System.out.println("the payment was through credit card:");
		
	}

	@Override
	public void redeem() {
		System.out.println("redeemed by credit card:");
		
	}
	
}
