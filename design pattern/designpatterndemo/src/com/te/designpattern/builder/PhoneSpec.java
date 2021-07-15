package com.te.designpattern.builder;

public class PhoneSpec {
	
	private String os;
	private int ram;
	private String processor;
	private int battery;
	private double display;
	
	public PhoneSpec setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneSpec setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneSpec setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneSpec setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneSpec  setDisplay(double display) {
		this.display = display;
		return this;
	}
	@Override
	public String toString() {
		return "PhoneSpec [os=" + os + ", ram=" + ram + ", processor=" + processor + ", battery=" + battery
				+ ", display=" + display + "]";
	}
	public Phone getPhone() {
		return new Phone(os, ram, processor, battery, display);
	}

}
