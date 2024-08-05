package com.techlabs.listtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.techlabs.list.model.Student;

public class Studenttest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = scanner.nextInt();

		List<Student> students = new ArrayList<Student>();
		readStudents(students, scanner);

		System.out.println("Using normal loop:");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		System.out.println("Using advanced for loop:");
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("Using iterator:");
		Iterator<Student> studentIterator = students.iterator();
		while (studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}

		System.out.println("Using list iterator:");
		ListIterator<Student> studentListIterator = students.listIterator();
		while (studentListIterator.hasNext()) {
			System.out.println(studentListIterator.next());
		}
		while (studentListIterator.hasPrevious()) {
			System.out.println(studentListIterator.previous());
		}
	}

	private static void readStudents(List<Student> students , Scanner scanner)
{
	for (int i = 0; i < i; i++) {
        System.out.println("Enter details for student ");
        System.out.print("rollnumber: ");
        int rollnumber = scanner.nextInt();
        System.out.print("Name: ");
        String name = scanner.next(); 
        System.out.print("percentage: ");
        int percentage = scanner.nextInt();

        students.add(new Student(rollnumber, name, percentage));
    }
}
}