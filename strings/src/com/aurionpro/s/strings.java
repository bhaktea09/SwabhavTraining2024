package com.aurionpro.s;

public class strings {

	public static void main(String[] args) {
		String name1 =  new String ("AT");
		String name2 = new String  ("AT");
		String name3 = "B";
		 name3 = name3 + "M";
		 System.out.println(name3.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name1 == name2);
	}
	
}
