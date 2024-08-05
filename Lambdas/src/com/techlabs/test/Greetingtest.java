package com.techlabs.test;

import com.techlabs.model.Igreeting;

public interface Greetingtest {
		public static void main(String[] args) {
//			Igreeting greet = new Igreeting() {
//
//				@Override
//				public void say(String name) {
//					// TODO Auto-generated method stub
//					System.out.println("hello"+ name);
//				}
//				
//			};
			Igreeting greet = name-> System.out.println("hello"+name);;
			greet.say("world");
		}
}
