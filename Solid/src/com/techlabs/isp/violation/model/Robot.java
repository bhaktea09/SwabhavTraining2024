package com.techlabs.isp.violation.model;

public class Robot implements Iworker {

	@Override
	public void startwork() {
		// TODO Auto-generated method stub
		System.out.println("robot has started working:");
	}

	@Override
	public void stopwork() {
		// TODO Auto-generated method stub
		System.out.println("robot  has stopped working:");
	}

	@Override
	public void eat() {

		System.out.println("robot  is eating :");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("robot  is drinking:");
	}

}
