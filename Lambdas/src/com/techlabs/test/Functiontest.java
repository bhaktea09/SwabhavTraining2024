package com.techlabs.test;

import java.util.function.Function;

public class Functiontest {

	public static void main(String[] args) {
		Function<Integer, Integer> squarenumber = (Integer number) -> number * number;
		method(squarenumber);
	}
	public static void method(Function<Integer, Integer> squarenumber)
	{
		System.out.println(squarenumber.apply(4));
	}

}
