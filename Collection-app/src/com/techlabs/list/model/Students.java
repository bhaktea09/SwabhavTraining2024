package com.techlabs.list.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.list.model.StudentComparator.Namecomparator;

public class Students {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(2, "bhakti", 30));
		students.add(new Student(5, "parag", 80));
		students.add(new Student(1, "shubham", 40));
		students.add(new Student(3, "mitali", 50));
		students.add(new Student(4, "gaurav", 60));

		System.out.println("students not sorted :");
		printstudents(students);

		System.out.println("students after sorting roll number :");
		Collections.sort(students, new StudentComparator.RollnumberComparator());
		printstudents(students);
		System.out.println("students after sorting name :");
		Collections.sort(students, new StudentComparator.Namecomparator());
		printstudents(students);
	}

	private static void printstudents(List<Student> students) {
		for (Student student : students)
			System.out.println(student);
	}

}
