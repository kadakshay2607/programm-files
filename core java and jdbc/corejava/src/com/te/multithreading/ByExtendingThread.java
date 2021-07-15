package com.te.multithreading;

public class ByExtendingThread extends Thread {
	
	public void run() {
		for (char i = 'z'; i > 'a'; i--) {
			System.out.println(i+" "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}
}
