package com.citibank.main.domain;

public abstract class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	public Account() {
		System.out.println(" Deafult constructor Account Class");
	}
	
	public Account(int accountNumber, String name, double balance) {
		 	System.out.println("3 Param Constructor");
			this.accountNumber = accountNumber;
			this.name = name;
			this.balance = balance;
		}

//	public Account(int acctc , String  namec , Double balancec) {
//		System.out.println(" parameterized constructor Account Class");
//		accountNumber 	= acctc;
//		name			= namec;
//		balance			= balancec;
//				
//	}
	

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract boolean withdraw(double amount);
	public abstract boolean deposit(double amount);
//	public boolean withdraw(double amount) {
//		System.out.println("Withdraw() called");
//		if (amount > 0 && amount <=balance) {
//			balance = balance - amount;
//			return true;
//		}
//		return false;
//	}
//	public boolean deposit(double amount) {
//		System.out.println("deposit called");
//		if (amount >0 ) {
//			balance = amount + balance;
//			return true;
//		}
//		return false;
//	}
}
