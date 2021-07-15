package com.te.deadlock;

public class customer extends Thread {
	
	Gowdown gowdown;
	int items;
	
	@Override
	public void run() {
		gowdown.purchase(items);
	}
	
	public customer(Gowdown gowdown, int items) {
		super();
		this.gowdown = gowdown;
		this.items = items;
	}
	
	

}
