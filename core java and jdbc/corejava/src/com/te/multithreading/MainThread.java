package com.te.multithreading;

import java.util.Iterator;

public class MainThread {

	public static void main(String[] args) {
		ByExtendingThread thread = new ByExtendingThread();
		ByExtendingThread1 thread2 = new ByExtendingThread1();
		thread.start();
		thread2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" "+ thread.currentThread().getName());
		
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}

}
