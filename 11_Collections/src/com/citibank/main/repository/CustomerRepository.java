package com.citibank.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {
	
	private List<Customer> customerList = new ArrayList<>();
	
	@Override
	public boolean addNewCustomer(Customer customer) {
		return customerList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerID(int customerID) {
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerID) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerID(Customer customer) {
		for (Customer c : customerList) {
			if (c.getCustomerId() == customer.getCustomerId() ) {
				c.setCustomerId(customer.getCustomerId());
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				//or c=customer;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerID(int customerID) {
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerID) {
				customerList.remove(customer);
				return true;
			}
		}
		return false;
	}

}
