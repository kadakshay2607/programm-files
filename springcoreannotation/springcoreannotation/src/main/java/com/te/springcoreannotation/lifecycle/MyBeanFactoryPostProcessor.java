package com.te.springcoreannotation.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition definition = beanFactory.getBeanDefinition("get");
		MutablePropertyValues propertyValues = definition.getPropertyValues();
		propertyValues.addPropertyValue("mess", "Hi! you are almost done learning Spring core!!!");
	}

}
