package com.techlabs.srp.voilation.model;

public class Invoice {
	private int id;
	private String description;
	private double amount;
	private double tax;
	public Invoice(int id, String description, double amount, double tax) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double calculatetex() {
		return amount * tax/100;
	}
	public void print() {
		System.out.println("ID" +id);
		System.out.println("Description" +description);
		System.out.println("amount" +amount);
		System.out.println("tax" +calculatetex());
		System.out.println("total amount"+amount+calculatetex());
	}
}
