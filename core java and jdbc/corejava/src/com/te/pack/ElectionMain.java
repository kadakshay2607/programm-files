package com.te.pack;

import com.te.customexception.InvalidAgeException;

public class ElectionMain {

	public static void main(String[] args) {
		
		Election election = new Election();
		
		try {
			election.checkAge(14);
		} catch (InvalidAgeException e) {
			System.out.println(	e.getMessage());
		
		}

	}

}
