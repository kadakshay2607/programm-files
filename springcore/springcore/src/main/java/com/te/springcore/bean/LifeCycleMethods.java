package com.te.springcore.bean;


public class LifeCycleMethods {

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting value");
		this.id = id;
	}

	public void hi() {
		System.out.println("Inside the init phase");
	}
	
	public void bye() {
		System.out.println("Inside the destroy phase");
	}

	@Override
	public String toString() {
		return "LifeCycleMethods [id=" + id + "]";
	}
	
	
	
}
