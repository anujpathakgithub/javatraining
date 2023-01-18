package com.citibank.main.domain;

public class Current extends Account {
	private double overdraftLimit;
	private double overdraftLimit1;
	

	public Current(int accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
		overdraftLimit1 = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (getBalance() >=  amount) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (getBalance() <  amount) {
				
				overdraftLimit = overdraftLimit + getBalance() - amount;
				setBalance(0);
				return true;
			}

		}
		return false ;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (overdraftLimit + amount < overdraftLimit1) {
				overdraftLimit = overdraftLimit + amount;
				setBalance(0);
				return true;
			}
			if (overdraftLimit + amount >= overdraftLimit1) {
				
				setBalance(overdraftLimit + amount + getBalance()- overdraftLimit1);
				overdraftLimit = overdraftLimit1;
				return true;
			}	
			
		}
		return false;
	}
}
// Instructor code is different. Have a look

//package com.citibank.main.domain;
//
//public class Current extends Account {
//	private double overdraftLimit;
//
//	private double initialOverdraftBalance;
//
//	public Current() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Current(int accountNumber, String name, double balance, double overdraftLimit) {
//		super(accountNumber, name, balance);
//		this.overdraftLimit = overdraftLimit;
//		initialOverdraftBalance = overdraftLimit;
//
//	}
//
//	public double getOverdraftLimit() {
//		return overdraftLimit;
//	}
//
//	public void setOverdraftLimit(double overdraftLimit) {
//		this.overdraftLimit = overdraftLimit;
//	}
//
//	@Override
//	public boolean withdraw(double amount) {
//		if (amount > 0) {
//			if (amount <= getBalance()) {
//				setBalance(getBalance() - amount);
//				return true;
//			}
//
//			if (amount > getBalance() && amount <= getBalance() + overdraftLimit) {
//				amount = amount - getBalance();
//				setBalance(0);
//				overdraftLimit = overdraftLimit - amount;
//				return true;
//			}
//		}
//		return false;
//	}
//
//	@Override
//	public boolean deposit(double amount) {
//		if (amount > 0) {
//			if (initialOverdraftBalance > overdraftLimit) {
//				if (amount < initialOverdraftBalance - overdraftLimit) {
//					overdraftLimit = overdraftLimit + amount;
//					return true;
//				} else {
//					amount = amount - (initialOverdraftBalance - overdraftLimit);
//					overdraftLimit = initialOverdraftBalance;
//					setBalance(getBalance() + amount);
//					return true;
//				}
//			} else {
//				setBalance(getBalance() + amount);
//				return true;
//			}
//		}
//		return false;
//	}
//}
//



