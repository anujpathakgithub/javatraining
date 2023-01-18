package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.Factory.ConnectionFactory;
import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {

	private List<Customer> customerList = new ArrayList<>();

	private String sql;

	private Connection connection;
	private PreparedStatement preparedStatement;
	private int rowCount;
	private ResultSet resultSet;

	@Override
	public boolean addNewCustomer(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "insert into customer_details(name,address) values(?,?)";

		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());

			rowCount = preparedStatement.executeUpdate();

			if (rowCount > 0) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println("execption while insert query:" + e.getMessage());
			return false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;

	}

	@Override
	public Customer getCustomerByCustomerID(int customerID) {
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details where customer_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerID);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				customerID = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				Customer customer = new Customer(customerID, name, address);
//				customerList.add(customer);
				return customer;
			}
		} catch (SQLException e) {
			System.out.println("Exception in select query::" + e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		connection = new ConnectionFactory().getConnection();
		sql = "select * from customer_details";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int customerID = resultSet.getInt("customer_id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				Customer customer = new Customer(customerID, name, address);
				customerList.add(customer);
			}
		} catch (SQLException e) {
			System.out.println("Exception in select query::" + e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return customerList;
	}

	@Override
	public boolean updateCustomerByCustomerID(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql = "update customer_details set name=? ,address =?  where customer_id = ?";

		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			preparedStatement.setInt(3,customer.getCustomerId());

			rowCount = preparedStatement.executeUpdate();
			System.out.println("rowcount update" +rowCount);
			if (rowCount > 0) {
				return true;
			}

		} catch (SQLException e) {
			System.out.println("execption while update query:" + e.getMessage());
			return false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerID(int customerID) {
		connection = new ConnectionFactory().getConnection();
		sql = "delete from customer_details where customer_id = ?";

		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, customerID);
			
			rowCount = preparedStatement.executeUpdate();
			System.out.println("rowcount delete" +rowCount);
			if (rowCount > 0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Exception in delect query::" + e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

}
