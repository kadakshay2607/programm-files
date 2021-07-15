package com.te.multithreading;

public class AccountHolder {

	public static void main(String[] args) {

		Account account = new Account(5000);
		Husband husband = new Husband(account);
		husband.start();
		Wife wife = new Wife(account);
		wife.start();
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		account.checkBalance();

	}

}
