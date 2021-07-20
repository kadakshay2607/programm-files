package com.te.springcore.annotations.interfaces;

public class Cat implements Animal{

	@Override
	public void speak() {
		System.out.println("Meow meow...");
		
	}

	@Override
	public void eat() {
		
		System.out.println("eats biscuits...");
		
	}
	
	

}
