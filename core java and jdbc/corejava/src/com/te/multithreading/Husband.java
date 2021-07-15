package com.te.multithreading;

public class Husband extends Thread {

	Account account;

	@Override
	public void run() {
		account.deposit(1000);
		System.out.println(Thread.currentThread().getName());
	}

	public Husband(Account account) {
		super();
		this.account = account;
	}
	
}
