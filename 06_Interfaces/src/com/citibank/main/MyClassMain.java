package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.domain.YourClass;
import com.citibank.main.factory.Myfactory;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main start");
		
		MyClass myClass = new MyClass();
		myClass.show();
		
		System.out.println("----------------");

		MyInterface myInterface = new MyClass();
		myInterface.show();

		System.out.println("----------------");
		System.out.println(MyInterface.message);
		System.out.println(MyClass.message);
		System.out.println("----------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Myclass Object");
		System.out.println("2. Yourclass Object");
		System.out.println(" Enter Choice");
		int choice = scanner.nextInt();
		
		myInterface = Myfactory.getobject(choice);
		
		if (myInterface !=null) {
			myInterface.show();
		}
		else
			System.out.println();
		
		System.out.println("Main end");

	}

}
