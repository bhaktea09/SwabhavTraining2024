package com.techlabs.model;

public class Operations {
	public int addition(int number1,int number2) {
		return number1+number2;
	}
	public int subtraction(int number1,int number2) {
		return number1-number2;
	}
	public int multiplication(int number1,int number2) {
		return number1*number2;
	}
	public int division(int number1,int number2) {
		return number1/number2;
	}
	public int[] squareofArrayElements(int number[]) {
		for(int i=0;i<number.length;i++)
			number[i] = number[i]*number[i];
		return number;
	}
	public boolean isEven(int number) {
		return number %2 ==0;
	}
	public double division1(int number1, int number2) {
		if(number2==0)
			throw new ArithmeticException();
		return number1/number2;
	}
}
