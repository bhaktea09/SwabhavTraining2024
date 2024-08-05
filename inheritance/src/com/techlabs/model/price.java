package com.techlabs.model;

public class price extends FourWheeler_s  {
	private int price;

	public price(int price, int mileage , String engine) {
		super(engine , mileage);
		this.price=price;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "price [price=" + price + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
