package com.techlabs.structural.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class Shoppingcart implements Iitems {

	private List<Iitems> cartitems;

	public Shoppingcart() {
		this.cartitems = new ArrayList<>();
	}

	
	public void additemstocart(Iitems item) {
		cartitems.add(item);
	}

	
	public List<Iitems> getcartitems() {
		return cartitems;
	}

	public double getprice() {
		return getprice();
	}


	@Override
	public String getItemname() {
		String name = null;
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public int getItemprice() {
		int price=0;
		// TODO Auto-generated method stub
		return price;
	}
}
