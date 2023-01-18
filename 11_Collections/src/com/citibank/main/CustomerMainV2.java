package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.servive.CustomerService;
import com.citibank.main.servive.CustomerServiceInterface;

public class CustomerMainV2 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		CustomerService customerService = new CustomerService();
		
		System.out.println("Adding Customers");
		
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Anuj Pathak", "Pune");
		Customer customer3 = new Customer(103, "Mohit Suryavanshi", "Pune");
		Customer customer4 = new Customer(104, "Akhil", "Pune");
		Customer customer5 = new Customer(105, "Ronak", "Pune");
		
		System.out.println("Adding First Customer;;" + customerService.addNewCustomer(customer1));
		System.out.println("Adding second Customer;;" + customerService.addNewCustomer(customer2));
		System.out.println("Adding third Customer;;" + customerService.addNewCustomer(customer3));
		System.out.println("Adding Fourth Customer;;" + customerService.addNewCustomer(customer4));
		System.out.println("Adding Fifth Customer;;" + customerService.addNewCustomer(customer5));
		
		System.out.println("---------------------------------------");
		System.out.println("Reading all customers from database/List");
		List<Customer> customerList =  customerService.getAllCustomer();
		
		for (Customer customer : customerList) {
			System.out.println(customer);
		
	
		}
		System.out.println("---------------------------------------");
		System.out.println("reading one customer from database/list");
		Customer customer =  customerService.getCustomerByCustomerID(102);
		System.out.println(customer);
		
		System.out.println("---------------------------------------");
		System.out.println("Update Customer Details");
		Customer customerUpdate =  new Customer(101, "vivek", "Delhi");
		boolean result = customerService.updateCustomerByCustomerID(customerUpdate);
		if (result) {
			System.out.println("Updated successfully");
			System.out.println("Current status for all customers");
			List<Customer> cust =  customerService.getAllCustomer();
			for (Customer custu : cust) {
				System.out.println(custu);
			}		
		}else 
			System.out.println("No Customer found to update");
		
		System.out.println("---------------------------------------");
		System.out.println("delete Customer Details");
		Customer customerDelete =  new Customer(101, "vivek", "Delhi");
		boolean result1 = customerService.deleteCustomerByCustomerID(102);
		if (result1) {
			System.out.println("deleted successfully");
			System.out.println("Current status for all customers");
			List<Customer> cust =  customerService.getAllCustomer();
			for (Customer custd : cust) {
				System.out.println(custd);
			}		
		}else 
			System.out.println("No Customer found to update");

	}

}
