package com.techlabs.structural.proxy.test;

import java.awt.Image;

import com.techlabs.structural.proxy.model.IImage;
import com.techlabs.structural.proxy.model.Proxyimage;

public class Proxytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proxyimage image = new Proxyimage( null, "example.jpg");
		image.display();
		
	}

}
