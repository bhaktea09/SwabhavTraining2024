package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.*;
public class AreaofCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle :- ");
		int r = sc.nextInt();
		Circle area = new Circle(r);
		area.initialize(r);
		System.out.println("Area: " + area.CalculateArea());
	}
	
}
