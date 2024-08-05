package com.techlabs.structural.Facade.model;

public class ItalianMenu implements IMenu {

	@Override
	public IMenu displaymenu() {
		// TODO Auto-generated method stub
		System.out.println("pizza");
		System.out.println("pasta");
		return new ItalianMenu();
	}

}
