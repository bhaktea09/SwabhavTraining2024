package com.techlabs.creational.decorator.model;

public class Oilchange extends CarServiceDecorator {

	public Oilchange(ICarservice carobj) {
		super(carobj);
		// TODO Auto-generated constructor stub
	}

	public double Oilchange(ICarservice carobj) {
		
		// TODO Auto-generated constructor stub
		return 500 + super.getcost();
	}
	
}
