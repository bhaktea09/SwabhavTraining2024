package com.techlabs.model;

public class book {
	
	private String name;
	private String author;
	private int price;
	private String publication;

	
	public book(String name, String author, int price, String publication) {
		super();
		
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}
	
	    public String getname() {
	        return name;
	    }

	    public void setname(String name) {
	        this.name = name;
	    }
	    public String getauthor() {
	        return author;
	    }

	    public void setauthor(String author) {
	        this.author = author;
	    }
	    public int getprice() {
	        return price;
	    }

	    public void setprice(int price) {
	        this.price = price;
	    }
	     public String getpublication() {
	        return publication;
	    }
	    public void setpublication(String publication) {
	    	        this.publication = publication;
	    	    }
	    
	    public void displayDetails() { 
	    System.out.println("Book Name :- " + name );
		  System.out.println("Book Author :- " + author);
		  System.out.println("Book Price :- " + price);
		  System.out.println("Book Publication :- " + publication);
	    }
	
}