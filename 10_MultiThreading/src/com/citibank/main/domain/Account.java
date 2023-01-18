package com.citibank.main.domain;

public class Account {
	private double balance = 50000;
	private double amount;
//	private double amount;

//	public Account(double amount ) {
//		super();
//		this.amount = amount;
//	
//	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double amount) {
		this.balance = balance;
	}

	public synchronized boolean withdraw(double amount) {
		System.out.println("Withdraw started");
		balance = balance - amount;
		System.out.println("Withdraw End");
		return true;
	}
	public synchronized boolean deposit(double amount) {
		System.out.println("Deposit started");
		balance = balance + amount;
		System.out.println("Deposit end");
		return true;
	}
}
