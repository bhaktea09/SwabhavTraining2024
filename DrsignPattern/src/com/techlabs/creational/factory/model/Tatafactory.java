package com.techlabs.creational.factory.model;

public class Tatafactory implements ICarfactory {

	@Override
	public Icar makecar() {
		// TODO Auto-generated method stub
		return new Tata();
	}

}
