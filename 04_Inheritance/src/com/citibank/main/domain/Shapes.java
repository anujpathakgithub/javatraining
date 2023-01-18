package com.citibank.main.domain;
// Generalization Class or Base class
public abstract class Shapes {

	public Shapes() {
		System.out.println("Default Constructor for Shapes");
	}

	public Shapes(int size) {
		System.out.println("param Constructor for Shapes");
		System.out.println("size::" + size);
	}
	
//	public void draw() {
//		System.out.println("Drawing Shapes");
//	}

	public abstract void draw() ;

	public void convertShapes() {
		System.out.println("Converting shapes");
	}
}
