package com.te.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Product;

public class ProductMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("PropertyConfig.xml");
		Product product = (Product) beanFactory.getBean("prod");
		System.out.println(product);

	}

}
