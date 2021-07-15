package com.te.customexception;

public class InvalidAgeException extends RuntimeException {

	String messag;
	public InvalidAgeException(String message) {
		super();
		this.messag = message;
	}
	@Override
	public String getMessage() {
		return this.messag;
	}

}
