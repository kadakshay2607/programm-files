package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotation.bean.Shop;
import com.te.springcoreannotation.config.AllFruitConfig;

public class FruitMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AllFruitConfig.class);
		Shop shop = applicationContext.getBean("ar",Shop.class);
		System.out.println(shop.getName());
		shop.getFruit().taste();
		shop.getFruit().color();
		
	}

}
