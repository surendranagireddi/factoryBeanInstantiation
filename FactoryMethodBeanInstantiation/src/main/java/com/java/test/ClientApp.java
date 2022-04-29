package com.java.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ClientApp {
	
public static void main(String[] args) {
	

		
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/java/cfgs/applicationContext.xml");
		// get Spring bean class object.
		Class clz =factory.getBean("c1",Class.class	);
		System.out.println("clz obj data ::"+clz.toString());
		
		System.out.println("---------------------------------------");
		
		Calendar cal = factory.getBean("cal",Calendar.class);
		System.out.println("cal obj data ::"+cal.toString()+" "+cal.getClass());
		
		System.out.println("------------------------------");
		
		Properties props = factory.getBean("props",Properties.class);
		System.out.println("props obj data:: "+ props.toString()+"props obj class "+props.getClass());
		
		System.out.println("-----------------------------------");
		
		String ss = factory.getBean("s2",String.class);
		System.out.println("ssObj data ::"+ss.toString()+"ss obj type"+ss.getClass());
		
		System.out.println("----------------------------------------");
		String ss1 = factory.getBean("s3", String.class);
		System.out.println("ss1 obj data ::"+ss1.toString()+"ss1 obj type"+ss1.getClass());
		
		System.out.println("Welcome to my world");
		
		
	}
}


