package com.techlabs.structural.adapter.model;

public class Hat implements Iitems {
	private String shortname;
	private String longname;
	private int price;
	private int tax;
	
	//constructor
	public Hat(String shortname, String longname, int price, int tax) {
		super();
		this.shortname = shortname;
		this.longname = longname;
		this.price = price;
		this.tax = tax;
	}
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getLongname() {
		return longname;
	}
	public void setLongname(String longname) {
		this.longname = longname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String getItemname() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getItemprice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
