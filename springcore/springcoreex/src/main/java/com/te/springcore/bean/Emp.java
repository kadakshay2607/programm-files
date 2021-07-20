package com.te.springcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Emp implements Serializable {
	
	private int id;
	private String name;
	private EmpAddress empAddress;

}
