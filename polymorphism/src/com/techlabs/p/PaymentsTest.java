package com.techlabs.p;

import com.techlabs.model.Banktransferpayment;
import com.techlabs.model.Creditcardpayments;
import com.techlabs.model.Paypalpayment;

public class PaymentsTest {
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
