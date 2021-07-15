package com.te.customexception;

public class Election {
	int age;

	public Election() {
		
	}
	public void ageCheck(int a)throws InvalidAgeException {
		this.age = a;
		if (age>18) {
			System.out.println("valid for vote.");	
		}
		else {
			throw new InvalidAgeException("age is invalid");
		}
		
	}

}
