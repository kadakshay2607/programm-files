package com.te.portal;

public class InvalidEmailException extends Exception {
	String message;

	public InvalidEmailException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}



}
