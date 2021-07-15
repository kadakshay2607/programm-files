package com.te.customexception;

public class MainAccount {

	public static void main(String[] args) {
		Account account = new Account(100);
		try {
			account.withdrawn(1000);
		} catch (InsufficientBalanceException e) {
			
		System.out.println(e.getMessage());
		}

	}

}
