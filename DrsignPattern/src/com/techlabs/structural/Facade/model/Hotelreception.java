package com.techlabs.structural.Facade.model;

public class Hotelreception {
    private IMenu indianMenu;
    private IMenu italianMenu;

    public Hotelreception() {
        indianMenu = new IndianMenu();
        italianMenu = new ItalianMenu();
    }

    public IMenu getIndianMenu() {
        return indianMenu;
    }

    public IMenu getItalianMenu() {
        return italianMenu;
    }
}
