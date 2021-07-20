package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Data;

@Data

public class Emp implements Serializable {

	private int id;
	private String name;
	private EmpAddress empAddress2;
	
	//This constructor we are having when we are using autowire= "constructor"
	public Emp(int id, String name, EmpAddress empAddress2) {
		super();
		this.id = id;
		this.name = name;
		this.empAddress2 = empAddress2;
	}
	
	
}
