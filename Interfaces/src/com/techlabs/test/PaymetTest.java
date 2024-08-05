package com.techlabs.test;

import com.techlabs.model.Banktranferpayments;
import com.techlabs.model.Creditcardpayments;

public class PaymetTest {

	public static void main(String[] args) {
		Creditcardpayments c1 = new Creditcardpayments();
		Banktranferpayments b1 = new Banktranferpayments();
		
		c1.paybills();
		c1.redeem();
		
		b1.paybills();
		b1.redeem();
	}

}
