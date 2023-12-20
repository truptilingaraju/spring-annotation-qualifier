package com.ty.variable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Person person=(Person)context.getBean("person");
		person.use();
	}
}
