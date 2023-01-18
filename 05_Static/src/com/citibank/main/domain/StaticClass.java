package com.citibank.main.domain;

public class StaticClass {
	final int max = 500;
	
	public int num1 =10;
	public static int num2 = 10;
	
	public StaticClass() {
		System.out.println("Default constructor of StaticClass");
	}
	static {
		System.out.println("static block of StaticClass");
	}
	{
		System.out.println("Non static block of StaticClass");
	}
	public void show() {
		System.out.println("Hello");
	}
	public void display() {
		System.out.println(num1);
		System.out.println(num2);
		num1 = num1 + 10;
		num2 = num2 + 10;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(max);
	}

}
