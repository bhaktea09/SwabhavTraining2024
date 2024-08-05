package com.techlabs.structural.Facade.model;

public class Soundsystem {
	private boolean on;
	private boolean off;
	private int volume;

	public void turnon() {
		System.out.println("dvd turn on");
	}
	public void turnoff() {
		System.out.println("dvd turn off");
	}
	public void volume(int volume) {
		
		System.out.println("volume set to :" +volume);
	}
}
