package com.te.customexception;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	public void withdrawn(double amount) throws InsufficientBalanceException {
		if (amount<=balance) {
			System.out.println("Rs"+amount+" withdrawn.");
			System.out.println("Remaining balance "+(balance-amount));	
		}
		else {
			throw new InsufficientBalanceException("Balance is insufficient");
		}
		
		
	}

	
	

}
