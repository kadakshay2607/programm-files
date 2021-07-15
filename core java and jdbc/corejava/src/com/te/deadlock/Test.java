package com.te.deadlock;

public class Test {

	public static void main(String[] args) {
		
		Gowdown gowdown = new Gowdown(100);
		new customer(gowdown, 60).start();
		new customer(gowdown, 90).start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Manufacture(gowdown, 100).start();

	}

}
