package com.techlabs.test;

import com.techlabs.model.box;
public class boxtest {

	public static void main(String[] args) {
		
		box box1 = new box( 20, 40, 50);
		System.out.println(box1);
		box1.display();
		box1.initialize(10, 20, 30);
		System.out.println(box1);
		box1.display();
		System.out.println("area of box "+box1.CalculateArea());
		
		
	}

}
