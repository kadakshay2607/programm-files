package com.te.springcore.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Student implements Serializable {
	
	private List<String> names;
	private Set<String> address;
	private Map<Integer, String> map;
	
	public Student() {
		super();
	}
	
	

}
