package com.techlabs.model;

public class CricketPlayer {
	private int playerid;
	private String name;
	private int numberofmatches;
	private int runs;
	private int wickets;

	public CricketPlayer()
	{
		
	}

	 public CricketPlayer(int playerid, String name, int numberofmatches, int runs, int wickets) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.numberofmatches = numberofmatches;
		this.runs = runs;
		this.wickets = wickets;
	}


	public int playerid() {
	        return playerid;
	    }

	    public void setplayerid(int  playerid) {
	        this.playerid=playerid;
	    }

	    public String name() {
	        return name;
	    }

	    public void setname(String name) {
	        this.name = name;
	    }
	    public int numberofmatches() {
	        return numberofmatches;
	    }

	    public void setnumberofmatches(int numberofmatches) {
	        this.numberofmatches = numberofmatches;
	    }
	    public int runs() {
	        return  runs;
	    }

	    public void setRuns(int  runs) {
	        this. runs =  runs;
	    }
	     public int wickets() {
	        return wickets;
	    }
	    public void setwickets(int wickets) {
	    	        this.wickets = wickets;
	    	    }
	    
	    
	    public int calculateaverage () {
	    
			return  this.runs / this.numberofmatches ;
	    }
	    
	    public void displayDetails() {
	        System.out.println("playerid: " + playerid);
	        System.out.println("Name: " + name);
	        System.out.println("numberofmatches: " + numberofmatches);
	        System.out.println("runs: " + runs);
	        System.out.println("wickets: " + wickets);
}
}