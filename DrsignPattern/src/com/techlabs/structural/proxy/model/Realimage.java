package com.techlabs.structural.proxy.model;

public class Realimage implements IImage {
	private String filename;

	public Realimage(String filename) {
		super();
		this.filename = filename;
	}

	public void loadimagefromdisk() {
		System.out.println("loading image :" + filename);
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("displaying image :" + filename);
	}

}
