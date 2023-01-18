package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.servive.CustomerService;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		List<Customer> customerList = customerService.getAllCustomer();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		int customerId = 11;	
		Customer customer = customerService.getCustomerByCustomerID(customerId);
		if (customer != null) {
			System.out.println(customer);
		}
		else {
			System.out.println("Customer not found:"+ customerId );
		}
		Customer customerAdd  = new Customer();
		customerAdd.setName("Anuj7");
		customerAdd.setAddress("mumbai");
		customerService.addNewCustomer(customerAdd);
		if (customerAdd !=null) {
			System.out.println("Insert is successful");
		}
		else {
		System.out.println("Error in Insert");
		}
		Customer customerUpdate = new Customer();
		customerUpdate.setCustomerId(2);
		customerUpdate.setName("AnujXX");
		customerUpdate.setAddress("Kharadi");
		customerService.updateCustomerByCustomerID(customerUpdate);
		if (customerUpdate !=null) {
			System.out.println("Update is Successful");
		}
		else {
			System.out.println("Update not done");
		}
		
		Customer customerDelete = new Customer();
		customerDelete.setCustomerId(2);
		boolean result = customerService.deleteCustomerByCustomerID(customerDelete.getCustomerId());
		
		if (result) {
			System.out.println("Delete is successful");
		}
		else {
			System.out.println("delete not done");
		}
	}
	

}
