package com.te.springcoreannotation.interfaace;

public class Cat implements Animal {

	@Override
	public void speak() {
		System.out.println("meow");
		
	}

	@Override
	public void eat() {
		System.out.println("fish");
		
	}

}
