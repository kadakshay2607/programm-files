package com.te.pack;

import com.te.customexception.InvalidAgeException;

public class Election {
	
	int age;

	public Election() {
		
	}
	
	public void checkAge(int age)throws InvalidAgeException {
		this.age = age;
		
		if (age >= 18) {
			System.out.println("Eligible for voting");		
		}
		throw new InvalidAgeException("not eligiable");
		
	}

}
