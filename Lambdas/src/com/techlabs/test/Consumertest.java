package com.techlabs.test;

import java.util.function.Consumer;

public class Consumertest {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (Integer number) -> System.out.println(" square of anumber is :" + number*number);
		consumer.accept(5);
	}

}
