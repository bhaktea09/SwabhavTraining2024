package com.techlabs.model;

public class Vehical {
	private String engine;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Vehical(String engine) {
		super();
		this.engine=engine;
	}

	@Override
	public String toString() {
		return "Vehical_mercedes [engine=" + engine + ", getEngine()=" + getEngine() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
}
