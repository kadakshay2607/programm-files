package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.LifeCycleInterfaces;
import com.te.springcore.bean.LifeCycleMethods;

public class LifeCycleMain {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		context.registerShutdownHook();
		LifeCycleInterfaces cycleMethods =  (LifeCycleInterfaces) context.getBean("lifecycleInterface");
		System.out.println(cycleMethods);
		
	}

}
