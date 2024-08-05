package com.techlabs.creational.decorator.model;

public class PremiumHat implements IHat {

    @Override
    public String getName() {
        return "Shraddha";
    }

    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public String getDescription() {
        return "busy";
    }
}
