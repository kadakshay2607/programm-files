package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentDetails implements Serializable {
	
	private int id;
	
	private String name;
	
	private StudentAddress address;
	
	
}
