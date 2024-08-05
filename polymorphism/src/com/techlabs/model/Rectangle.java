package com.techlabs.model;

public class Rectangle extends Base {
    private int length;
    private int breadth;
    
    public Rectangle() {
        super();
        this.length = length;
        this.breadth = breadth;
    }
    
    public int getArea() {
        return length * breadth;
    }
    
    public void area() {
        System.out.println("area of rectangle"+length * breadth);
    }
}
