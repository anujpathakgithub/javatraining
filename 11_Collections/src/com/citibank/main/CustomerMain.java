package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		System.out.println(" Main started");

		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Anuj Pathak", "Pune");
		Customer customer3 = new Customer(103, "Mohit Suryavanshi", "Pune");
		Customer customer4 = new Customer(104, "Akhil", "Pune");
		Customer customer5 = new Customer(105, "Ronak", "Pune");

		List<Customer> customerList = new ArrayList<>();

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		printAllCustomers(customerList);

		Scanner scanner = new Scanner(System.in);
//		int customerId;  // below code tested not commented
//		System.out.println("enter the customer No");
//		customerId = scanner.nextInt();
//		PrintCustomerByCustomerID(customerList, customerId);

//		int customerId; // below code tested not commented
//		String name, address;
//		System.out.println("enter the customer No");
//		customerId = scanner.nextInt();
//
//		scanner.nextLine();
//		System.out.println("Enter New name");
//		name = scanner.nextLine();
//
//		System.out.println("Enter New address");
//		address = scanner.nextLine();
//		
//		Customer updateCustomer = new Customer(customerId, name, address);
//		
//		UpdateCustomerByCustomerID(customerList, updateCustomer);
//		printAllCustomers(customerList);
		int customerId;
		System.out.println("enter the customer No");
		customerId = scanner.nextInt();
		DeleteCustomerByCustomerID(customerList, customerId);
		printAllCustomers(customerList);
		
		System.out.println("Main end");

	}
	private static void DeleteCustomerByCustomerID(List<Customer> customerList,int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {

			if (customer.getCustomerId() == customerId) {
				customerList.remove(customer);
				
				System.out.println("Customer Details deleted" + customerId);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Customer not found");
		}
	}
	
	private static void UpdateCustomerByCustomerID(List<Customer> customerList, Customer customer) {
		
		boolean flag = false;
		for (Customer c : customerList) {

			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setAddress(customer.getAddress());
				c.setName(customer.getName());
				System.out.println("Customer Details updates");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Customer not found");
		}

	}

	private static void PrintCustomerByCustomerID(List<Customer> customerList, int customerId) {
		boolean flag = false;
		for (Customer customer : customerList) {
			int customerId1 = customer.getCustomerId();
			if (customerId == customerId1) {
				System.out.println(customer);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Customer not found");
		}
	}

	private static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All Customers");

		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
}
