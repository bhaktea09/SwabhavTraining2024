package com.techlabs.srp.solution.model;

public class Invoiceprinter {
	private Invoice invoice;
	private Taxcalculator taxcalculator;
	
	public Invoiceprinter(Invoice invoice, Taxcalculator taxcalculator) {
		super();
		this.invoice = invoice;
		this.taxcalculator = taxcalculator;
	}

	
	public void print() {
		System.out.println("ID" +invoice.getId());
		System.out.println("Description" +invoice.getDescription());
		System.out.println("amount" +invoice.getAmount());
		System.out.println("tax" +invoice.getTax());
		System.out.println("total amount"+invoice.getAmount());
	}
	
}
