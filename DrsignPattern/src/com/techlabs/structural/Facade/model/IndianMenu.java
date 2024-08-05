package com.techlabs.structural.Facade.model;

public class IndianMenu implements IMenu {

	@Override
	public IMenu displaymenu() {
		// TODO Auto-generated method stub
		System.out.println("idli");
		System.out.println("dosa");
		return new IndianMenu();
	}
	

	
	
}
