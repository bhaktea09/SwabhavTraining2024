package com.techlabs.model;

public class FourWheeler_s extends Vehical{
	 
	private int mileage ;

	
	public FourWheeler_s(String engine,int mileage) {
		super(engine);
		this.mileage=mileage;
		
	}
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "FourWheeler_s [mileage=" + mileage + ", getMileage()=" + getMileage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	 
}
