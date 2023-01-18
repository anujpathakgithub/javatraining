package com.citibank.main;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("Account Main start");
		
		Account account = new Account();
		
		AccountThread accountThread1 = new AccountThread(account, 1, 1000);
		Thread thread1 = new Thread(accountThread1);
		thread1.start();
		
		AccountThread accountThread2 = new AccountThread(account, 2, 1000);
		Thread thread2 = new Thread(accountThread2);
		thread2.start();
	
		System.out.println("Account Main End");

	}

}
