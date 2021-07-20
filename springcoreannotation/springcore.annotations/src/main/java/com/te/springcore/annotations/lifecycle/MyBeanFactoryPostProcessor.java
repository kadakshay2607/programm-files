package com.te.springcore.annotations.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		BeanDefinition definition = beanFactory.getBeanDefinition("messageBean");
		
		MutablePropertyValues propertyValues = definition.getPropertyValues();
		propertyValues.addPropertyValue("msg", "Hi! you are almost done learning Spring core!!!");
		
	}

}
