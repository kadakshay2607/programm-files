package com.te.springcore.annotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcore.annotations.bean.Pet;
import com.te.springcore.annotations.config.AllAnimalConfig;

public class AnimalTest {
	
	public static void main(String[] args) {
		 ApplicationContext context= new AnnotationConfigApplicationContext(AllAnimalConfig.class);
		 
		 Pet pet = context.getBean("pet1" , Pet.class);
		 System.out.println(pet.getName());
		 pet.getAnimal().eat();
		 pet.getAnimal().speak();
	}

}
