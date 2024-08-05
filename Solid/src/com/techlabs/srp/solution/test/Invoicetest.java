package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.model.Invoice;
import com.techlabs.srp.solution.model.Invoiceprinter;
import com.techlabs.srp.solution.model.Taxcalculator;

public class Invoicetest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1,"abs", 1222,123);
		Taxcalculator taxcalculator = new Taxcalculator(invoice);
		Invoiceprinter invoiceprinter = new Invoiceprinter(invoice,taxcalculator);
		invoiceprinter.print();
	}

}
