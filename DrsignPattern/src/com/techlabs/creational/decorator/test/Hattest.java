package com.techlabs.creational.decorator.test;

import com.techlabs.creational.decorator.model.IHat;
import com.techlabs.creational.decorator.model.StandardHat;

public class Hattest {

    public static void main(String[] args) {
        // Create a standard hat with specific attributes
        IHat standardHat = new StandardHat();

        
        System.out.println("Name: " + standardHat.getName());
        System.out.println("Price: " + standardHat.getPrice());
        System.out.println("Description: " + standardHat.getDescription());
    }
}
