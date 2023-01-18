package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {

			System.out.println("enter num1");
			num1 = scanner.nextDouble();
			System.out.println("enter num2");
			num2 = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("num1" + num1);
			System.out.println("num2" + num2);s
			System.out.println("Invalid input from user");
			System.out.println("program will continue its execution");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception in code!!");
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();
			System.out.println("thank you");
		}
	}

	public void calculate() {
		result = num1 / num2;
	}

	public void display() {
		System.out.println("Calculating Result");
		System.out.println("Result is " + result);
	}
}
