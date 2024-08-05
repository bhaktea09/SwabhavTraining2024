package com.techlabs.creational.decorator.model;

public class Wheelallign extends CarServiceDecorator{

	public Wheelallign(ICarservice carobj) {
		super(carobj);
		// TODO Auto-generated constructor stub
	}
	public double Wheelallign(ICarservice carobj) {
		
		// TODO Auto-generated constructor stub
		return 400 + super.getcost();
	}

}
