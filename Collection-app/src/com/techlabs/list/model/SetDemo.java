package com.techlabs.list.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set<Integer> set1= new HashSet<Integer>();
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		//TreeSet<Integer> set= new TreeSet<Integer>();

		set.add(4);
		set.add(2);
		set.add(6);
		System.out.println(set);
		LinkedHashSet<Integer> set2= new LinkedHashSet<Integer>();

		//Set<Integer> set2= new HashSet<Integer>();
		set2.add(3);
		set2.add(2);
		set2.add(1);
		System.out.println(set2);
		
		set.addAll(set2);
		System.out.println(set);
	
	}

}
