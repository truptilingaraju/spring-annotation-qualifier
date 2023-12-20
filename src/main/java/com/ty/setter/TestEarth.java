package com.ty.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEarth {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Earth earth=(Earth)context.getBean("earth");
		earth.rotate();
	}
}
