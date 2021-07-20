package com.te.springcoreannotation.interfaace;

public class Dog implements Animal{

	@Override
	public void speak() {
		System.out.println("bhow");
		
	}

	@Override
	public void eat() {
		System.out.println("chicken");
		
	}

}
