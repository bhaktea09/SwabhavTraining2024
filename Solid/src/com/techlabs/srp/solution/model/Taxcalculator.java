package com.techlabs.srp.solution.model;

public class Taxcalculator {
	private Invoice invoice;
	
	public double calculatetex() {
		return invoice.getAmount() * invoice.getTax()/100;
		
	}
	public Taxcalculator(Invoice invoice) {
		super();
		this.invoice = invoice;
	}
}
