package com.te.springcoreannotation.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.springcoreannotation.interfaace.Animal;

import lombok.Data;

@Data
public class Pet  implements Serializable{
	
	private String name;
	@Autowired
	@Qualifier("cat")
	private Animal animal;

}
