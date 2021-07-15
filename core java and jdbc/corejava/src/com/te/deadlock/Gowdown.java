package com.te.deadlock;

public class Gowdown {

	int products;

	public Gowdown(int products) {
		super();
		this.products = products;
	}
	
	public synchronized void store(int noOfItem) {
		
		products = products + noOfItem;
		System.out.println("Item Stored");
		this.notify();
	}
	public synchronized void purchase(int noOfItem) {
		while (noOfItem > products) {
			System.out.println("Out of stock");
		}
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		products = products + noOfItem;
		System.out.println("purchase completed");
		
	}
}
