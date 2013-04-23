package com.osgo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor 
{
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("In Before Initialisation Method.  Bean names is: " + beanName);
		return bean;
	} // end method postProcessBeforeInitialization

	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("In After Initialisation Method.  Bean names is: " + beanName);
		return bean;
	} // end method postProcessAfterInitialization

	
} // end Class DisplayNameBeanPostProcessor
