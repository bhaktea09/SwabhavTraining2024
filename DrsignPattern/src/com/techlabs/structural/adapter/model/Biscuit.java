package com.techlabs.structural.adapter.model;

public class Biscuit implements Iitems{
	private String name;
	private int mrp;
//constructor
	public Biscuit(String name, int mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String getItemname() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getItemprice() {
		// TODO Auto-generated method stub
		return mrp;
	}

}
