package com.techlabs.model;

public class Person {
		private int age;
		private String name;
		private String address;
		
		public Person(int age, String name, String address) {
			super();
			this.age = age;
			this.name = name;
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		@Override
		public String toString() {
			return "Person [age=" + age + ", name=" + name + ", address=" + address + ", getAge()=" + getAge()
					+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
}
