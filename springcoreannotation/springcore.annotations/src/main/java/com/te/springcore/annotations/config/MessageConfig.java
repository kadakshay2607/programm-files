package com.te.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcore.annotations.lifecycle.MessageBean;
import com.te.springcore.annotations.lifecycle.MyBeanFactoryPostProcessor;
import com.te.springcore.annotations.lifecycle.MyBeanPostProcessor;

@Configuration
public class MessageConfig {
	
	@Bean(name = "messageBean")
	public MessageBean messageBean() {
		
	 MessageBean bean = new MessageBean();
	 bean.setMsg("Hi! You're learning spring core!!");
	 return bean;
	}
	
	@Bean
	public  MyBeanFactoryPostProcessor  mbfpp() {
		return new MyBeanFactoryPostProcessor();
	}
	
	@Bean
	public  MyBeanPostProcessor mbpp() {
		return new MyBeanPostProcessor();
	}

}
