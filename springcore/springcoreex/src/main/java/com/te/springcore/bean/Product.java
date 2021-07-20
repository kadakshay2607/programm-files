package com.te.springcore.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product implements Serializable {
	
	
	private int pid;
	private String pname;
	private Map<String, Integer> map;
	private List<String> list;
	private Set <String> set;
	
	public Product() {
		super();
	}
	
	

}
