package com.citibank.main;

import java.util.HashSet;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		Set<Customer> customerSet = new HashSet<>();
		
		System.out.println("Adding Customers");
		
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Anuj Pathak", "Pune");
		Customer customer3 = new Customer(103, "Mohit Suryavanshi", "Pune");
		Customer customer4 = new Customer(104, "Akhil", "Pune");
		Customer customer5 = new Customer(105, "Ronak", "Pune");
		Customer customer6 = new Customer(105, "Ronak", "Pune");
		
		System.out.println("First Customer hash Code::" + customer1.hashCode());
		System.out.println("Adding First Customer::" + customerSet.add(customer1));

//		System.out.println("Adding second Customer;;" + customerSet.add(customer2));
//		System.out.println("Adding third Customer;;" + customerSet.add(customer3));
//		System.out.println("Adding Fourth Customer;;" + customerSet.add(customer4));
		System.out.println("Fifth Customer hash Code::" + customer5.hashCode());
		System.out.println("Adding Fifth Customer;;" + customerSet.add(customer5));
		System.out.println("sixth Customer hash Code::" + customer6.hashCode());
		System.out.println("Adding Sixth Customer;;" + customerSet.add(customer6));
		
		for (Customer customer : customerSet) {
			System.out.println(customer);
		}
		
	}

}
