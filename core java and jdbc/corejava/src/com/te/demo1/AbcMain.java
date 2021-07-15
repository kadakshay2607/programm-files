package com.te.demo1;

public class AbcMain {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		System.out.println(a.i);
		a=new B();
		a.m1();
		System.out.println(a.i);
		a=new C();
		a.m1();
		System.out.println(a.i);

	}

}
