package com.te.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.springcoreannotation.interfaace.Fruit;

import lombok.Data;
@Data
public class Shop {
	
	private String name;
	
	@Autowired
	private Fruit fruit;

}
