package com.ty.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBaby {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Baby baby=(Baby)context.getBean("baby");
		baby.like();
	}
}
