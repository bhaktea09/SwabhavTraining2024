package com.techlabs.structural.proxy.model;

public class Proxyimage implements IImage {
	private Realimage realimage;
	private String filename;

	public Proxyimage(Realimage realimage, String filename) {
		super();
		this.realimage = realimage;
		this.filename = filename;
	}

	public void display() {
		// TODO Auto-generated method stub
		if (realimage == null) {
			realimage = new Realimage(filename);
		}
		realimage.display();
	}

}
