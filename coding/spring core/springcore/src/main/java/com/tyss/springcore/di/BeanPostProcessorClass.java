package com.tyss.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorClass implements BeanPostProcessor
{
     @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException 
     {
    	 
    	System.out.println("Bean Before initialization : "+beanName);
    	return bean;
     }
     @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException 
     {
    	
    	System.out.println("Bean after initialization : "+beanName);
     	return bean;
    }
}
