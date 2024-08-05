package com.techlabs.creational.factory.model;

public class Carfactory {
	public Icar makecar (String  carname ) {
		Icar car = null;
		if(carname.equals(Carbrand.Maruti))
			car = new Maruti();
		if(carname.equals(Carbrand.Tata))
			car = new Tata();
		if (carname.equals(Carbrand.Mahindra))
			car = new Mahindra();
		return car;
		
	}
}
