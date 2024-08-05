package com.techlabs.srp.voilation.test;

import com.techlabs.srp.voilation.model.Invoice;

public class Invoicetest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1,"mobile phone",12345,90);
		invoice.print();

	}

}
