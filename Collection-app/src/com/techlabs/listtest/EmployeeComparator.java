package com.techlabs.listtest;

import java.util.Comparator;

import com.techlabs.list.model.Employee;

public class EmployeeComparator {

	public static class EmployeeidComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {

			return employee1.getEmployeeid() - employee2.getEmployeeid();
		}
	}

	public static class NameComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {

			return employee1.getName().compareTo(employee2.getName());
		}
	}

	public static class SalaryComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {

			return employee1.getSalaray() - employee2.getSalaray();
		}
	}
}
