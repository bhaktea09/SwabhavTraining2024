package com.techlabs.violation.model;

public class Taxcalculator {
	 DBlogger dblogger;

	public Taxcalculator() {
		super();
		this.dblogger = dblogger;
	}
	 public void calculateTax(int amount, int rate) {
		 int tax=0;
		 try {
			 tax=amount/rate;
			 System.out.println(tax);
		 }
		 
		 catch(Exception e) {
			 new DBlogger().log("divide by zero");
		 }
	 }
}
