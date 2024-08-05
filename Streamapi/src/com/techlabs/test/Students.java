package com.techlabs.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Students {
	public static void main(String[] args) {
		List<String> students =Arrays.asList("bhakti" , "parag" , "mitali" ,"gaurav","shubham","joey");
		
		students.stream()
		.sorted()
		.forEach((student)->System.out.println(student));
		
		students.stream()
		.sorted(Comparator.reverseOrder())
		.forEach((student)->System.out.println(student));
		
		students.stream()
		.sorted()
		.limit(3)
		.forEach((student)->System.out.println(student));
		
		students.stream()
		.sorted()
		.filter(student -> student.contains("a"))		
		.forEach((student)->System.out.println(student));
		
		students.stream()
		.sorted()
		.map(student  -> student.substring(0, 3))
		.limit(3)
		.forEach((student)->System.out.println(student));
		
		students.stream()
		.sorted()
		.filter(student -> (student.length()<=4))
		.forEach((student)->System.out.println(student));
		
		
		
	}
}
