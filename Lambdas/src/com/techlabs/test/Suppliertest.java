package com.techlabs.test;

import java.util.function.Supplier;

public class Suppliertest {

	public static void main(String[] args) {
		Supplier<Integer> randomnumber = () ->(int)(Math.random()*1000);
		System.out.println("number generated is :" +randomnumber.get());

	}

}
