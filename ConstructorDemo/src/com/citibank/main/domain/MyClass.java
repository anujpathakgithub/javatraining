package com.citibank.main.domain;

public class MyClass {
	public MyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Default contrcutor of MyClass");
	}
	public MyClass(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Integer contrcutor of MyClass");
	}
	
	public MyClass(int i , int j) {
		// TODO Auto-generated constructor stub
		System.out.println("Integer -2 contrcutor of MyClass");
	}
	
	public MyClass(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("String contrcutor of MyClass");
	}
	public void show() {
		System.out.println("Hi");
	}
}