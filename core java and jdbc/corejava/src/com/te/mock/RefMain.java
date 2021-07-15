package com.te.mock;

public class RefMain {
	
	RefMain() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {

      Reference reference =  RefMain::new;
      reference.test();

	}

}
