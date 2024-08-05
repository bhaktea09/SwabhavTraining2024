package com.techlabs.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Biprediacatetest {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> biggernumber =(Integer number1 , Integer number2) ->(number1>number2);
		System.out.println( biggernumber.test(10, 100));
	}

}
