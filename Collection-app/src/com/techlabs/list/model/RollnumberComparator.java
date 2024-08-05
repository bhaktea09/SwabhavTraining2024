package com.techlabs.list.model;

import java.util.Comparator;

public class RollnumberComparator implements Comparator<Student> {


	public int compare(Student student1, Student student2) {
		if(student1.getRollnumber()> student2.getRollnumber())
			return 1;
		if(student1.getRollnumber() < student2.getRollnumber())
			return -1;
		return 0;
	}
}