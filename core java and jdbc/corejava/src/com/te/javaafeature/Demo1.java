package com.te.javaafeature;

public class Demo1 {
	
	//public static void m1() {
		//System.out.println("from m1 method");
	//}
	//public  void m1() {
		//System.out.println("from m1 method");
	//}
	public  Demo1() {
		System.out.println("from m1 method");
	}

	public static void main(String[] args) {

       //Reference reference = Demo1::m1;
       Reference reference = Demo1::new;
      // Reference reference = new Demo1()::m1;
       reference.test();

	}

}
