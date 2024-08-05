package com.techlabs.isp.violation.model;

public class Labour implements Iworker {

	@Override
	public void startwork() {
		System.out.println("worker has started working:");

	}

	@Override
	public void stopwork() {
		// TODO Auto-generated method stub
		System.out.println("worker has stopped working:");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("worker is eating :");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("worker is drinking:");
	}

}
