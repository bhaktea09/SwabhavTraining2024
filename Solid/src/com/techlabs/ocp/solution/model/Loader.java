package com.techlabs.ocp.solution.model;

public class Loader implements Iworkable , ILunchinterval{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("loader ate");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("loader rested");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("loader started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(" loader stopped");
	}

}
