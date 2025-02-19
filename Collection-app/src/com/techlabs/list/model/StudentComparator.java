package com.techlabs.list.model;

import java.util.Comparator;

public class StudentComparator {
		public static class RollnumberComparator implements Comparator<Student> {


			public int compare(Student student1, Student student2) {
				if(student1.getRollnumber()> student2.getRollnumber())
					return 1;
				if(student1.getRollnumber() < student2.getRollnumber())
					return -1;
				return 0;
			}
		}

	
	public static class Namecomparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			
			return student1.getName().compareTo(student2.getName());
		}

	}

}
