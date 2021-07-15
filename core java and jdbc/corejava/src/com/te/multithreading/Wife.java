package com.te.multithreading;

public class Wife extends Thread {
	
	Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(1000);
		System.out.println(Thread.currentThread().getName());
	}
	

}
