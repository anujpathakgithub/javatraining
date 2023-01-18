package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
		Account account = new Account ();
		// Object Creation 
		// Class object = new class


	
		account.setAccountNumber(101);
		account.getAccountNumber();
		// Below is function Calling
		System.out.println(account.getAccountNumber());
		account.setBalance(100);
		account.deposit(100);
		account.getBalance();
		System.out.println(account.getBalance());
		
		account.withdraw(100);
		System.out.println("main end");
		
	}

}
