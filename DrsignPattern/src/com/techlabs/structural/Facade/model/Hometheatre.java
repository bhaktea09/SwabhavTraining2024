package com.techlabs.structural.Facade.model;

public class Hometheatre implements Idvd , Iprojector ,Isoundsystem{

	@Override
	public int volume() {
		// TODO Auto-generated method stub
		System.out.println("soundsystem volume");;
		return 0;
	}

	@Override
	public String input() {
		// TODO Auto-generated method stub
		System.out.println("input");
		return null;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("start");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}
}
