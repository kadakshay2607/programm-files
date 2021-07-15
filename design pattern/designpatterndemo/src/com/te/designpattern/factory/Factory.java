package com.te.designpattern.factory;

public class Factory {

	public OperatingSystem getOs(String s) {
		if (s.equalsIgnoreCase("powerful")) {
			return new Android();
		}
		else if (s.equalsIgnoreCase("fast")) {
			return new Ios();
		}
		else {
			return null;
		}
	}
}
