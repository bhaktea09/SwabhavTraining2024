package com.techlabs.model;

public class employee {
	private int employeeId;
	private String name;
	private double salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}
