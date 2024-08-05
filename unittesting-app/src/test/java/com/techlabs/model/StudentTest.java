package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	private IStudentservice studentservice;
	private Student student;
	
	@BeforeEach
	void init() {
		studentservice = Mockito.mock(IStudentservice.class);
		student = new Student (studentservice);
	}
	@Test
	void test() {
		Mockito.when(studentservice.gettotalmarks()).thenReturn(650);
		  Mockito.when(studentservice.gettotalnumberofsubjects()).thenReturn(10);

		  assertEquals(65,student.calculatepercentage());
		
	}

}
