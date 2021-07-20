package com.te.springcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Serializable{

	private int pId;
	private int pAge;

}
