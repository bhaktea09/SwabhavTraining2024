package com.techlabs.model;

public class Student {
	private IStudentservice studentservice;
	
	
	public Student(IStudentservice studentservice) {
		super();
		this.studentservice = studentservice;
	}


	double calculatepercentage() {
		return studentservice.gettotalmarks()/studentservice.gettotalnumberofsubjects();
	}
}
