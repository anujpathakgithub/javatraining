package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to XYZ Bank");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter accountNumner");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter Balance");
		double balance = scanner.nextDouble();
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);
		System.out.println("Yout account opened Successfully");
		System.out.println("Account Numner : :" + account.getAccountNumber() );
		System.out.println("Name ::" + account.getName());
		System.out.println("Balance::"+account.getBalance());

	}

}
