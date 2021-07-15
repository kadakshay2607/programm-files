package com.te.designpattern.builder;

public class Phone {

	private String os;
	private int ram;
	private String processor;
	private int battery;
	private double display;
	
	public Phone(String os, int ram, String processor, int battery, double display) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.battery = battery;
		this.display = display;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", battery=" + battery + ", display="
				+ display + "]";
	}
	
}
