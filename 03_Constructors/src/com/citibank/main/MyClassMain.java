package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");	
		MyClass myClass = new MyClass();
		myClass.show();
		
		System.out.println("---------------1");
		new MyClass();
		
		
		System.out.println("---------------2");
		new MyClass().show();
		
		System.out.println("---------------3");
		new MyClass(10);
		
		System.out.println("---------------4");
		new MyClass("Test");
		
		System.out.println("---------------5");
		new MyClass(10,20
				);
		
		System.out.println("main end");

	}

}
