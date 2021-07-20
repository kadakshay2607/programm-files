package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Data;
@Data

public class EmpAddress implements Serializable {
	
	private int  hno;
	private int  streetno;
	private String state;
	private String country;

}
