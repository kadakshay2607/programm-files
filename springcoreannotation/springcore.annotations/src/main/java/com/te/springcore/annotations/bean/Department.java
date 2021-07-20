package com.te.springcore.annotations.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Department implements Serializable{
	
	private int dId;
	private String dName;

}
