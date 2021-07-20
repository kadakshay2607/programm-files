package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Candidate implements Serializable {
	
	private int cid;
	private String cname;


}
