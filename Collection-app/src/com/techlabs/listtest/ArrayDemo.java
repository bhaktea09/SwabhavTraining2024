package com.techlabs.listtest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayDemo {

	public static void main(String[] args) {
		List <String> names = new ArrayList<String>(); //object
		List <Integer> numbers = Arrays.asList(10,20,30,40,50);
		//add elements and ArrayList should always run on strings
		System.out.println(names.size());
		System.out.println(names); // empty
		names.add("bhakti");
		names.add("mitali");
		names.add("shweta");
		names.add("shreya");
		System.out.println(names);
		names.add(2, "mai");
		names.add(5, "tai");
		System.out.println(names);
		names.remove("bhakti");
		System.out.println(names);

		
	}

}
