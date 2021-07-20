package com.te.springcore.annotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.springcore.annotations.interfaces.Animal;

import lombok.Data;

@Data
public class Pet implements Serializable{

	private String name;
	
	@Autowired
	@Qualifier("doginstance")
	private Animal animal;
}
