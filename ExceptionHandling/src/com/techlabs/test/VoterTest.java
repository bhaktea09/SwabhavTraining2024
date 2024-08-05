package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exceptions.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" enter voter id :");
		int voterid = scanner.nextInt();

		System.out.println(" enter first name");
		String firstname = scanner.next();

		System.out.println(" enter last name :");
		String lastname = scanner.next();

		System.out.println(" enter age :");
		int age = scanner.nextInt();
		Voter voter = null;
		try
		{
		Voter voter1 = new Voter (voterid, firstname , lastname ,age);
		
	}
		catch(AgeNotValidException Exception)
		{
			System.out.println("age not valid");
		}
		System.out.println(voter);
	}

}
