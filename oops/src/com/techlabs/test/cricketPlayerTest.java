package com.techlabs.test;
import com.techlabs.model.*;

import java.util.Scanner;

import com.techlabs.model.CricketPlayer;

public class cricketPlayerTest {

	public static void main(String[] args) {
		CricketPlayer[] players = new CricketPlayer[11];
		for (int i = 0; i < 12; i++) {
			players[i] = new CricketPlayer();
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			System.out.println("Enter playerid: -");
			String playerid = scanner.next();

			System.out.println("Enter name: -");
			String name = scanner.next();

			System.out.println("Enter number of matches: -");
			int numberofmatches = scanner.nextInt();

			System.out.println("Enter runs: -");
			String runs = scanner.next();

			System.out.println("Enter wickets : -");
			String wickets = scanner.next();

		}
		
	}

}
