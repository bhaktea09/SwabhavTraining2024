package com.techlabs.creational.decorator.model;

public class Goldenhat extends HatDecorator {
	private IHat hatobj;
	public Goldenhat(IHat hat) {
		super(hat);
		
		// TODO Auto-generated constructor stub
	}

	public int Goldenhat(IHat hat) {
		
		// TODO Auto-generated constructor stub
		return 300 + super.getPrice();
	}

}
