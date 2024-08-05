package com.techlabs.test;

import com.techlabs.model.Itest;
import com.techlabs.model.Reference;

public class Referencetest {

	public static void main(String[] args) {
		Itest test1 = Reference :: new;
		display(test1);
		Itest test2 = Reference :: staticprint;
		display(test2);
		Reference reference = new Reference();
		Itest test3 = reference :: print;
		display(test3);

	}
	private static void display(Itest test)
	{
		test.test();
	}
}
