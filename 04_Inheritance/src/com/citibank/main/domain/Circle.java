package com.citibank.main.domain;
// Specialized Class/Child class
public class Circle extends Shapes {
	public Circle() {
		super();
		System.out.println("Default Constructor of Circle");
	}
	public Circle(int size) {
		super(size);
		System.out.println("param Constructor of Circle");
		System.out.println("size::" + size);
	}
	 @Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}
	 

}
