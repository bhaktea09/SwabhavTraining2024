package com.techlabs.test;

import com.techlabs.model.Iaddition;

public interface Iaddertest {
public static void main(String[] args) {
	Iaddition adder=(number1, number2 ) ->  number1+number2;
	
	System.out.println(adder.add(8, 9));
}
}
