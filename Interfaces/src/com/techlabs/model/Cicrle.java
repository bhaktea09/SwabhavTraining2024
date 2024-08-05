package com.techlabs.model;

public class Cicrle implements Shape {
	private int radius;
	
	public Cicrle(int radius) {
		super();
		this.radius=radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(3.14*radius);
	}

	

}
