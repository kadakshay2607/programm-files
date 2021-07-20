package com.te.springcore.annotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Employee implements Serializable{
	
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("test")
	private Department department;

}
