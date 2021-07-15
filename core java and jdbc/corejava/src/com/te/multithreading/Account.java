package com.te.multithreading;

public class Account {

	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("insufficient balance");
			return;
		}
		balance = amount;
		System.out.println("withdraw cash");
		
	}
	public synchronized void deposit(double amount) {
		double temp = balance;
		temp = temp + amount;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = temp;
		System.out.println("deposite sucessful");
	}
	public synchronized void checkBalance() {
		System.out.println("current Balance : "+ balance);
	}
}
