package com.citibank.main.domain;

public class Triangle extends Shapes {	
	public Triangle() {
		System.out.println(" Constructor for Triangle Class");
	}
	public Triangle(int size) {
		System.out.println("param Constructor of Triangle");
		System.out.println("size::" + size);
	}
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
		
}
