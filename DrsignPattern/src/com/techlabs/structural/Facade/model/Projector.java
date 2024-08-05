package com.techlabs.structural.Facade.model;

public class Projector {
	private boolean on;
	private boolean off;
	private String input;
	
	public void turnon() {
		System.out.println("dvd turn on");
	}
	public void turnoff() {
		System.out.println("dvd turn off");
	}
	public void input() {
		System.out.println("input selected");
	}
	
}
