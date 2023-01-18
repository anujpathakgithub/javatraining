package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionTestMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Connection connection = null;
		
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("1.Driver loaded successfully");
			
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("Connection is successful");
			
			String sql = "insert into customer_details (name,address) values (?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setString(1, "Mohit");
//			preparedStatement.setString(2, "Pune");
			for (int i=1; i<6;i++ ) {
				System.out.println("Enter the customer name");
				String name  = scanner.nextLine();
				
				System.out.println("Enter the customer address");
				String address  = scanner.nextLine();
				preparedStatement.setString(1,name);
				preparedStatement.setString(2, address);
				
				int rowCount = preparedStatement.executeUpdate();
				System.out.println(rowCount);
				if (rowCount >0) {
					System.out.println(" Insert in successful");
				}
				else {
					System.out.println("No Record inserted");
				}
			}
		

				
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver not found");
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main end");

	}

}
