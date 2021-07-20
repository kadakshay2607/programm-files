package com.te.springcore.annotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.springcore.annotations.config.MessageConfig;
import com.te.springcore.annotations.lifecycle.MessageBean;

public class MessageTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		
		MessageBean bean = context.getBean("messageBean", MessageBean.class);
		System.out.println(bean.getMsg());
		
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
