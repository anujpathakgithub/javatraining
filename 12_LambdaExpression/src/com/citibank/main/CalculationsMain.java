package com.citibank.main;

import com.citibank.main.domain.CalculationInterface;

public class CalculationsMain {

	public static void main(String[] args) {

		CalculationInterface interface1 = new CalculationInterface() {

			@Override
			public double docalculation(double number1, double number2) {

				return number1 + number2;
			}
		};
		System.out.println(interface1.docalculation(10, 10));

		System.out.println("---Addition-------------");

		CalculationInterface calculationInterface = (a, b) -> {
			return a + b;

		};
		System.out.println("Addition::" + calculationInterface.docalculation(10, 10));
		
		interface1 = (n1,n2) -> n1+n2;
		System.out.println("Addition short way::" +interface1.docalculation(10, 10));
		
		
		System.out.println("Substraction");
		CalculationInterface calculationInterface2 = (a,b) -> {
			return a-b;
		};
		System.out.println("Substraction::" + calculationInterface2.docalculation(100,10));
	}
}
