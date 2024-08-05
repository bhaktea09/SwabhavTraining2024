package com.techlabs.list.model;

public class Student {
	private int rollnumber;
	private String name;
	private int percentage;
	public Student(int rollnumber, String name, int percentage) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", percentage=" + percentage
				+ ", getRollnumber()=" + getRollnumber() + ", getName()=" + getName() + ", getPercentage()="
				+ getPercentage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
