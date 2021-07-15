package com.te.exception;

public class UncheckedException {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (java.lang.Exception e) {
			System.out.println("Exception is handled");
		}

	}

}
