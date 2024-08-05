package com.techlabs.model;

public class Banktransferpayment extends Payment {
	@Override
	public  void paybills() {
		System.out.println("the payment done through Banktransferpayment:");
	}
	
	@Override
	public  void redeem() {
		System.out.println("redeemed by Banktransferpayment:");
	}
}
