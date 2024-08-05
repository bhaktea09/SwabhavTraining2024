package com.techlabs.list.model;

public class Employee {
	private int employeeid;
	private String name;
	private int salaray;

	public Employee(int employeeid, String name, int salaray) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.salaray = salaray;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalaray() {
		return salaray;
	}

	public void setSalaray(int salaray) {
		this.salaray = salaray;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", salaray=" + salaray + ", getEmployeeid()="
				+ getEmployeeid() + ", getName()=" + getName() + ", getSalaray()=" + getSalaray() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
