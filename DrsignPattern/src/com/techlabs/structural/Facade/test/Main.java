package com.techlabs.structural.Facade.test;

import com.techlabs.structural.Facade.model.Hotelreception;
import com.techlabs.structural.Facade.model.IMenu;

public class Main {
	public static void main(String[] args) {
		Hotelreception reception = new Hotelreception();

		IMenu indianMenu = reception.getIndianMenu();
		indianMenu.displaymenu(); 

		IMenu italianMenu = reception.getItalianMenu();
		italianMenu.displaymenu(); 
	}
}
