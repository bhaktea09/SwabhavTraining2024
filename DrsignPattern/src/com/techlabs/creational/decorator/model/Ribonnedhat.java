package com.techlabs.creational.decorator.model;

public class Ribonnedhat extends HatDecorator {
	private IHat hatobj;
	public Ribonnedhat(IHat hat) {
		super(hat);
		
	}

	public int Ribonnedhat(IHat hat) {
		return 400 + super.getPrice();
		}

}
