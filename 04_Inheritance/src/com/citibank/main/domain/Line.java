package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		System.out.println("Constructor for Line Class");
	}
	public Line(int size) {
		System.out.println("param Constructor of Line");
		System.out.println("size::" + size);
	}
	@Override
	public void draw() {
		System.out.println("Drawing Line");
	}

}
