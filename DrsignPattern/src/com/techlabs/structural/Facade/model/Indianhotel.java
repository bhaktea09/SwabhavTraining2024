package com.techlabs.structural.Facade.model;

public class Indianhotel implements Ihotel{

	public IMenu getmenu() {
		// TODO Auto-generated method stub
		return new IndianMenu();
	}

	
	
}
