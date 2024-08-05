package com.techlabs.model;

public class student {
	public int rollnumber;
	public String name;
	public int age;
	public int percentage;
	
	public int getrollnumber() {
		  return rollnumber;
		 }
		 public void setrollnumber(int r) {
		  rollnumber = r;
		 }
		 public String getname() {
		  return name;
		 }
		 public void setname(String n) {
			 name = n;
		 }
		 public int getage() {
		  return age;
		 }
		 public void setage(int a) {
			 age = a;
		 }
		 public int getpercentage() {
			  return percentage;
			 }
			 public void setpercentage(int p) {
				 percentage = p;
			 }
		 public void display() {
		  System.out.println("rollnumber = " + rollnumber);
		  System.out.println("name" + name);
		  System.out.println("age" + age);
		  System.out.println("percentage" + percentage);
		 }

		 

	
	

}
