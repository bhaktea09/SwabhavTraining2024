package com.aurionpro.s;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuilder name1 = new StringBuilder("Bhakti");
		System.out.println(name1.hashCode());
		name1 = name1.append("Pansare");
		System.out.println(name1.hashCode());

	}

}
