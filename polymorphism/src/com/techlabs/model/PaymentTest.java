package com.techlabs.model;

public class PaymentTest {

	public static void main(String[] args) {
		Creditcardpayments c1 = new Creditcardpayments();
		Paypalpayment p1 = new Paypalpayment();
		Banktransferpayment b1 = new Banktransferpayment();
		
		c1.paybills();
		c1.redeem();
		p1.paybills();
		p1.redeem();
		b1.paybills();
		b1.redeem();
	}

}
