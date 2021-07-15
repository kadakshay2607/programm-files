package com.te.javaafeature;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			System.out.println("Thread 1 started");
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		Runnable runnable1 = () -> {
			System.out.println("Thread 1 started");
			
			for (char i = 'a';  i< 'z'; i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
	}
}
