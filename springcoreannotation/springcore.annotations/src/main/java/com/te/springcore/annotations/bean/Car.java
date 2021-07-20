package com.te.springcore.annotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Car implements Serializable{
	
	private String brand;
	private String model;
	
	 @Autowired                                 
	private Engine engine;
}
