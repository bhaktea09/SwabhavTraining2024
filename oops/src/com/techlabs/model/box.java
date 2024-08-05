package com.techlabs.model;

public class box {
	public int width;
	public int height;
	public int depth;
	
	
	public box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public void initialize(int width, int height, int depth)
	{
	    this.width=width;
		this.height=height;
		this.depth= depth;
	}
	 public int getwidth() {
	        return width = width;
	    }

	    public void setwidth(int widht) {
	        this.width = width;
	    }
	    public int getheight() {
	        return height = height;
	    }

	    public void setdepth(int depth) {
	        this.depth = depth;
	    }
	    
	public void display()
	{
	System.out.println("width:"+ width);
	System.out.println("height:"+height);
	System.out.println("depth:"+depth);
}
	public int CalculateArea() {
		return width*height*depth;
	}
	
	
	
}
