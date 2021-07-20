package com.te.springcoreannotation.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data

public class Car implements Serializable {

	private String model;
	private String brand;
	@Autowired
	private Engine engine;

	
	
}
