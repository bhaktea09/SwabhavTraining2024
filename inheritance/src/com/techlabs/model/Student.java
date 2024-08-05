package com.techlabs.model;

public class Student extends Person{
	 private int percentage;
	 private int rollnumber;
	 
		public Student( int age,String name,String address,int percentage, int rollnumber) {
		super(age , name, address);
		this.percentage = percentage;
		this.rollnumber = rollnumber;
		
	}

		public int getPercentage() {
			return percentage;
		}

		public void setPercentage(int percentage) {
			this.percentage = percentage;
		}

		public int getRollnumber() {
			return rollnumber;
		}

		public void setRollnumber(int rollnumber) {
			this.rollnumber = rollnumber;
		}

		@Override
	public String toString() {
		return "Student [percentage=" + percentage + ", rollnumber=" + rollnumber + ", getPercentage()="
				+ getPercentage() + ", getRollnumber()=" + getRollnumber() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
