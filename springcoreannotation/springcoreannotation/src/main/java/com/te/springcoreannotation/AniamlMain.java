package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotation.bean.Pet;
import com.te.springcoreannotation.config.AllAnimalConfig;

public class AniamlMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AllAnimalConfig.class);
		Pet pet = applicationContext.getBean("pet1",Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().speak();
	}
}
