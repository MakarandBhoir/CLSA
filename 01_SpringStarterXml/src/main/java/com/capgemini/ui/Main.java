package com.capgemini.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		/* Step 1 - Get the reference of Spring Framework or Spring Container */
		//BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-config.xml");
		
		//Student student = new Student();
		
		/* Step 2 - Retrieve the required object */
		//Student student = (Student) factory.getBean("student");
		
		/* Step 3 - Use the object for any purpose */
//		System.out.println(student);
//		System.out.println(student.getAddress());
		
		//((ConfigurableApplicationContext)factory).close();
	}
}
