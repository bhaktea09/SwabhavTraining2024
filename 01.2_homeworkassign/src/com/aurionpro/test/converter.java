//Write a program that converts minutes into hours and minutes 
//(e.g., 130 minutes is 2 hours and 10 minutes).


package com.aurionpro.test;
	import java.util.*;
		public class converter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalMinutes = 130;
		int hours = totalMinutes / 60 ;
		int minutes = totalMinutes % 60;
		System.out.println( totalMinutes + " minutes is equal to " + hours + " hours and " + minutes + "minutes");

	}

}
