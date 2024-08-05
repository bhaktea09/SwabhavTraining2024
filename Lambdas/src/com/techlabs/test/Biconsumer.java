package com.techlabs.test;

import java.util.function.BiConsumer;

public class Biconsumer {

	public static void main(String[] args) {
		BiConsumer<Integer , Integer > number = (Integer number1 ,Integer number2) -> System.out.println("product :"+ number1*number2);
		number.accept(5,7);
	}

}
