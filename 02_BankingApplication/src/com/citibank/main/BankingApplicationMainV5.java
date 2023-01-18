package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int accountNumner;
		String name;
		double balance;
		int choice;
		double amount;
		String salaryAccount;
		boolean isSalary;
		String continueChoice;

		System.out.println("Enter accountNumner");
		accountNumner = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();

		System.out.println("Salary Account - Press 'Yes' or 'No");
		salaryAccount = scanner.next();

		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		if (salaryAccount.equals("Yes")) {
			isSalary = true;
		} else
			isSalary = false;

		Savings savings = new Savings(accountNumner, name, balance, isSalary);
		
		System.out.println("Yout account opened Successfully");
		System.out.println("Account Numner : :" + savings.getAccountNumber());
		System.out.println("Name ::" + savings.getName());
		System.out.println("Balance::" + savings.getBalance());

		System.out.println();

		do {

			showTransactionMenu(scanner, savings);

			System.out.println("Do you want to continue");
			continueChoice = scanner.next();


		} while (continueChoice.equals("Yes"));

	}

	private static void showTransactionMenu(Scanner scanner, Savings savings) {
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
			if (savings.withdraw(amount))
				System.out.println("withdraw is successful" + "Balance" + savings.getBalance());
			else
				System.out.println("withdraw is unsuccessful");
			break;
		case 2:
			System.out.println("Enter amount to deposit to deposit");
			amount = scanner.nextDouble();
			if (savings.deposit(amount))
				System.out.println("Deposit is successful" + "Balance" + savings.getBalance());
			else
				System.out.println("Deposit is unsuccessful");
			break;
		case 3:
			System.out.println("Check Balance");
			System.out.println("Balance" + savings.getBalance());
			break;

		case 4:
			System.out.println("Thank You");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}