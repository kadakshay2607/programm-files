package com.te.multithreading;

public class ByImplementingRunnable implements Runnable {

	@Override
	public void run() {
		for (char i = 'a'; i < 'z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
