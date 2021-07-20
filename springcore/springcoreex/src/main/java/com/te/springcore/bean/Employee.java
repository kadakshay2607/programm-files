package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable{
	
	private int eid;
	private String ename;
	
	
	public Employee() {
		super();
	}	

}
