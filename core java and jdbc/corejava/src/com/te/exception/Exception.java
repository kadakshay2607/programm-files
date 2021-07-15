package com.te.exception;

public class Exception {
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		m2();
		System.out.println(10/0);
		System.out.println("m1");
	}
	public static void m2() {
		m3();
		System.out.println("m2");
	}
	public static void m3() {
		m4();
		System.out.println("m3");
	}
	public static void m4() {
		System.out.println("m4");
	}

}
