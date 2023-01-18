package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101,"Anuj",1000);
		Employee employee2 = new Employee(102,"Paritosh",1000);
		Employee employee3 = new Employee(103,"Vivek",1000);
		Employee employee4 = new Employee(104,"Debayan",1000);
		Employee employee5 = new Employee(105,"Uday",1000);
		
		System.out.println(employee1.getEmployeeid());
		System.out.println(employee1.getName());
		System.out.println(employee1.getSalary());
		
		System.out.println(employee2.getEmployeeid());
		System.out.println(employee2.getName());
		System.out.println(employee2.getSalary());
		
		System.out.println(employee3.getEmployeeid());
		System.out.println(employee3.getName());
		System.out.println(employee3.getSalary());
		
		System.out.println(employee4.getEmployeeid());
		System.out.println(employee4.getName());
		System.out.println(employee4.getSalary());
		
		System.out.println(employee5.getEmployeeid());
		System.out.println(employee5.getName());
		System.out.println(employee5.getSalary());
		
		System.out.println("--------------------------------1");
		
		System.out.println(employee1.toString());
		
		System.out.println("--------------------------------2");
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
		System.out.println("--------------------------------3");
		
		Employee[] allEmployees = new Employee[5];

		Scanner scanner = new Scanner(System.in);
		int employeeid;
		String name;
		double salary;
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter Empid");
			employeeid = scanner.nextInt();
			System.out.println("enter name");
			name = scanner.next();
			System.out.println("enter salary");
			salary = scanner.nextDouble();
			
			Employee employee = new Employee(employeeid, name, salary);
			allEmployees[i] = employee;
			System.out.println();
			
		}
		System.out.println("All Employess");
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}

}
