package com.te.springcore;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentAddress implements Serializable {
	
	private int  hno;
	private int  streetno;
	private String state;
	private String country;

}
