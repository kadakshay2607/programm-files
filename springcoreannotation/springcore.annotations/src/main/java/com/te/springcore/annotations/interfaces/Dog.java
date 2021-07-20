package com.te.springcore.annotations.interfaces;

public class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("Bow bow....");

	}

	@Override
	public void eat() {

		System.out.println("eats meat, pedigree....");

	}

}
