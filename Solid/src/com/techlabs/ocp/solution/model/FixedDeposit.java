package com.techlabs.ocp.solution.model;

public class FixedDeposit {
	private static final double ifestivalinterest = 0;
	private int accountnumber;
	private String name;
	private double principal;
	private int duration;
	private ifestivalinterest Festival;

	// private double getInterestrates() {
	// if(Festival == Festival.NEWYEAR )
	// {
	// return 8/100;
	// }
	// if(Festival == Festival.DIWALI)
	// {
	// return 8.5/100;
	// }
	// if(Festival == Festival.HOLI)
	// {
	// return 7.5/100;
	// }
	// if(Festival == Festival.OTHERS)
	// {
	// return 6.5/100;
	// }
	// return (Double) null;
	//

	public FixedDeposit(int accountnumber, String name, double principal, int duration, ifestivalinterest festival) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		Festival = festival;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public ifestivalinterest getFestival() {
		return Festival;
	}

	public void setFestival(ifestivalinterest festival) {
		Festival = festival;
	}

	

	public double calculatesimpleinterest() {
		return this.principal* this.duration* this.ifestivalinterest/100;
		
	}

}
