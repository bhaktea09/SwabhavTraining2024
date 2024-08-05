package com.techlabs.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Bifunctiontest {

	public static void main(String[] args) {
		BiFunction<Integer, Integer,Integer> addnumber = (Integer number1 , Integer number2) -> (number1 + number2);
		System.out.println(addnumber.apply(4,8));


	}

}
