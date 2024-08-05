package com.techlabs.structural.Facade.model;

public class DVD {
	private boolean start;
	private boolean stop;
	private boolean on;
	private boolean off;

	public void start() {
		System.out.println("dvd start");
	}
	
	public void stop() {
		System.out.println("dvd  stop");
	}
	
	public void turnon() {
		System.out.println("dvd turn on");
	}
	
	public void turnoff() {
		System.out.println("dvd turn off");
	}
	}