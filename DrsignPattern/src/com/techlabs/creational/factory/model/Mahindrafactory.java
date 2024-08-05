package com.techlabs.creational.factory.model;

public class Mahindrafactory implements ICarfactory{

	@Override
	public Icar makecar() {
		// TODO Auto-generated method stub
		return new Mahindra();
	}

}
