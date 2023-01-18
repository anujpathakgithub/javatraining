package com.citibank.main;

import com.citibank.main.domain.StaticClass;

public class StaticClassMain {

	public static void main(String[] args) {
//		StaticClass staticClass = new StaticClass();
//		staticClass.display();
//		System.out.println("----------------1");
//		StaticClass staticClass1 = new StaticClass();
//		staticClass1.display();	
//		To access Num1, we need object as it is not static but num2 can be accessed as its static.
//		StaticClass.num1 = 50;
//		StaticClass.num2 = 50;
//		System.out.println(StaticClass.num2);
//		StaticClass staticClass = new StaticClass();
//		staticClass.num2 = 50;
//		System.out.println(StaticClass.num2);
//		int num3 = 50;
//		System.out.println(num3);     // Can be access as local variable
//		System.out.println(StaticClass.num1);  --> cant be access as not static
//		System.out.println(StaticClass.num2);  // Can be accessed as static variable
//		StaticClass staticClass = new StaticClass();
//		System.out.println("----------------------");
		System.out.println("Main Start");
		StaticClass staticClass;
		StaticClass.num2 = 100;
		System.out.println(StaticClass.num2);
		System.out.println("Mian end");
	}

}
