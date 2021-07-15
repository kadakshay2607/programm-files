package com.te.designpattern.factory;

public class BuyPhone {

	public static void main(String[] args) {
		Factory factory = new Factory();
		OperatingSystem a = factory.getOs("fast");
        a.spec();
	}

}
