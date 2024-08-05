package com.aurionpro.test;

import java.util.Scanner;

public class waterbillcalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("no.of units :");
		int numberofunitsconsumed = 100;
		int metercharge = 75;
		int charge;
		
		if(numberofunitsconsumed <= 100) {
			charge = numberofunitsconsumed * 5;
		} else {
			if(numberofunitsconsumed <= 250) {
				charge = numberofunitsconsumed *10;
			} else {
				charge = numberofunitsconsumed *20;
			}
		}
		
		int waterBill = metercharge + charge;
		
		
		System.out.println("Water bill is " + waterBill);
		
		
		}
		

	}


