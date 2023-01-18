package com.citibank.main.domain;

public class Savings extends Account {

	private boolean isSalary;

	public Savings() {
		System.out.println("Default Constructor for Savings Class");
	}

	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub

		if (amount > 0 && amount <=getBalance()) {
			if (isSalary) {
				setBalance(getBalance()-amount);
				return true;
		}
			if (isSalary == false && getBalance() - amount >=15000) {
				setBalance(getBalance()-amount);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount );
			return true;
		}
		return false;
	}

}
