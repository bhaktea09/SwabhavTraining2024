package com.techlabs.creational.decorator.model;

public class HatDecorator implements IHat {
	private IHat hatobj;

	public HatDecorator(IHat hat) {
		this.hatobj = hatobj;
	}

	@Override
	public String getName() {

		return hatobj.getName();
	}

	@Override
	public String getDescription() {

		return hatobj.getDescription();
	}

	@Override
	public int getPrice() {

		return hatobj.getPrice();
	}

}
