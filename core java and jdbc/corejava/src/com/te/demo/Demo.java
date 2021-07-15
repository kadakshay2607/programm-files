package com.te.demo;

public class Demo {
	private static  void m1() {
		System.out.println("private method m1");
	}
	public static void m2() {
		System.out.println("public method m2");


	}
	protected static void m3() {
		System.out.println("protected method m3");


	}
	static void m4() {
		System.out.println("default method m4");


	}

	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
	}

}
