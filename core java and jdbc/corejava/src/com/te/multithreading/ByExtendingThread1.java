package com.te.multithreading;

public class ByExtendingThread1 extends Thread {

	
		public void run() {
			for (char i = 'a'; i < 'z'; i++) {
				System.out.println(i+" "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
	}
	

}
