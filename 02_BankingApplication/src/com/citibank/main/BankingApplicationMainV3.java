package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();

		int accountNumner;
		String name;
		double balance;
		int choice;
		double amount;
		String continueChoice;

		System.out.println("Enter accountNumner");
		accountNumner = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();

		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		account.setAccountNumber(accountNumner);
		account.setName(name);
		account.setBalance(balance);
		System.out.println("Yout account opened Successfully");
		System.out.println("Account Numner : :" + account.getAccountNumber());
		System.out.println("Name ::" + account.getName());
		System.out.println("Balance::" + account.getBalance());

		System.out.println();

		do {

			showTransactionMenu(scanner, account);

			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
//			if (continueChoice == "yes" || continueChoice == "No") {
//				continue;
//			} else {
//				System.out.println("Please enter eithrt 'Yes' or 'No'");
//				continueChoice = scanner.next();
//			}

		} while (continueChoice.equals("Yes"));
		
	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		int choice;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("Press 1 for Withdraw");
		System.out.println("Press 2 for Deposit");
		System.out.println("Press 3 for Check Balance");
		System.out.println("Press 4 for Exit");

		System.out.println("Enter your Choice");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter amount to deposit to Withdraw");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("withdraw is successful" + "Balance" + account.getBalance() );
			else
				System.out.println("withdraw is unsuccessful");
		case 2:
			System.out.println("Enter amount to deposit to deposit");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposit is successful"+ "Balance" + account.getBalance() );
			else
				System.out.println("Deposit is unsuccessful");
		case 3:
			System.out.println("Check Balance");
			System.out.println("Balance" + account.getBalance());
			break;

		case 4:
			System.out.println("Thank You");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}