package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		MyClass myClass = new MyClass();
		myClass.show();
		System.out.println("---------------------");
		new MyClass().show();
		
		System.out.println("---------------------");
		new MyClass(0);
		
		System.out.println("---------------------");
		new MyClass(0,0);
		
		System.out.println("---------------------");
		new MyClass("Test");
		
		System.out.println("Main End");
	}

}
