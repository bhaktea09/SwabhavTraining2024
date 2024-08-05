package com.techlabs.model;

import com.techlabs.exceptions.AgeNotValidException;

public class Voter {
	private int voterid;
	private String firstname;
	private String lastname;
	private int age;

	public Voter(int voterid, String firstname, String lastname, int age) {
		super();
		this.voterid = voterid;
		this.firstname = firstname;
		this.lastname = lastname;
		
			if (age < 18)
				throw new AgeNotValidException();
			this.age = age;
		
	}

	public int getVoterid() {
		return voterid;
	}

	public void setVoterid(int voterid) {
		this.voterid = voterid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18)
			throw new AgeNotValidException();
		this.age = age;
		

	}

	@Override
	public String toString() {
		return "Voter [voterid=" + voterid + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", getVoterid()=" + getVoterid() + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
