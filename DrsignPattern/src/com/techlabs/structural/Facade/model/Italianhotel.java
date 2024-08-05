package com.techlabs.structural.Facade.model;

public class Italianhotel implements Ihotel{

	@Override
	public IMenu getmenu() {
		// TODO Auto-generated method stub
		return new ItalianMenu();
	}

	
}
