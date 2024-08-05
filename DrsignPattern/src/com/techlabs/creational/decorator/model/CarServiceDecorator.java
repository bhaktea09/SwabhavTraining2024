package com.techlabs.creational.decorator.model;

public abstract class CarServiceDecorator implements ICarservice{
	private ICarservice carobj;

	public CarServiceDecorator(ICarservice carobj) {
		super();
		this.carobj = carobj;
	}
	@Override
	public double getcost() {
		return carobj.getcost();
	}
}
