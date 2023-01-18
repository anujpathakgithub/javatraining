package com.citibank.main.domain;

public class AccountThread implements Runnable {
	private int choice;
	private double amount;
	private double balance;
	Account account;

	public  AccountThread(Account account, int choice, double amount) {
		super();
		this.choice = choice;
		this.amount = amount;
		this.account = account;

	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		if(choice ==1) {
		account.withdraw(amount);
		System.out.println("Balance after Withdraw::" +account.getBalance() );
		}
		if(choice ==2) {
		account.deposit(amount);
		System.out.println("Balance after Deposit::" + account.getBalance());
		}
	}
}
