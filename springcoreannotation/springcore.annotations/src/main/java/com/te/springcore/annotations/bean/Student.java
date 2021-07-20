package com.te.springcore.annotations.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Serializable{

	private int id;
	private String name;
	
	public Student() {
		
	}
}
