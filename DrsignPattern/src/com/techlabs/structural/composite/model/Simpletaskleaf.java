package com.techlabs.structural.composite.model;

public class Simpletaskleaf implements ITaskcomponent{
	private String title;

	@Override
	public String gettitle() {
		// TODO Auto-generated method stub
		return "bhakti";
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title=title;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("simple task :" +title);
	}
}
