package com.te.pack;

public class InvalidAge extends Exception {
	
	String mes;

	public InvalidAge(String message) {
		this.mes = message;
	}

	@Override
	public String getMessage() {
	
		return mes;
	}
	
	

}
