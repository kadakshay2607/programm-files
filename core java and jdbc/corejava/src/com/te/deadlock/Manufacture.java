package com.te.deadlock;

public class Manufacture extends Thread {
	
	Gowdown gowdown;
	int items;
	
	@Override
	public void run() {
		gowdown.store(items);
	}

	public Manufacture(Gowdown gowdown, int items) {
		super();
		this.gowdown = gowdown;
		this.items = items;
	}
	
	
	
	
	

}
