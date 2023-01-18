package com.citibank.main.repository;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerRepositoryInterface {
	
	public boolean addNewCustomer(Customer customer);
	
	public Customer getCustomerByCustomerID(int customerID);
	
	public List<Customer> getAllCustomer();
	
	public boolean updateCustomerByCustomerID(Customer customer);
	
	public boolean deleteCustomerByCustomerID(int customerID);
}
