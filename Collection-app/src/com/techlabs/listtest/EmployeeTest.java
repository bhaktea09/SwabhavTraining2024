package com.techlabs.listtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.list.model.Employee;
import com.techlabs.list.model.Student;
import com.techlabs.list.model.StudentComparator;
import com.techlabs.list.model.StudentComparator.RollnumberComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "bhakti", 90000));
		employees.add(new Employee(3, "parag", 70000));
		employees.add(new Employee(2, "shubham", 60000));
		employees.add(new Employee(4, "shweta", 40000));

		System.out.println("students not sorted :");
		printstudents(employees);

		System.out.println("students after sorting remployeeid  :");
		Collections.sort(employees, new EmployeeComparator.EmployeeidComparator());
		printstudents(employees);
		System.out.println("students after sorting name :");
		Collections.sort(employees, new EmployeeComparator.NameComparator());
		printstudents(employees);
	}

	private static void printstudents(List<Employee> employees) {
		for (Employee employee : employees)
			System.out.println(employees);
	}

}
