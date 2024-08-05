package com.techlabs.list.model;

public class Car {
	private int carid;
	private String companyname;
	private int price;
	private int mileage;
	public Car(int carid, String companyname, int price, int mileage) {
		super();
		this.carid = carid;
		this.companyname = companyname;
		this.price = price;
		this.mileage = mileage;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	 public String toString() {
	        return "Car [carId=" + carid + ", companyName=" + companyname + ", price=" + price + ", mileage=" + mileage + "]";
	    }
	
}
