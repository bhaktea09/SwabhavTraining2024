package com.techlabs.test;

import com.techlabs.model.Isayable;

public class SayableTest {

	public static void main(String[] args) {
		Isayable sayable = new Isayable() {
			@Override
			public void say() {
				System.out.println("I am inside sayable");
			}
		};

		sayable.say();
	}
}
