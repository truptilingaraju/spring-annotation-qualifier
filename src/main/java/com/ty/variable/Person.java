package com.ty.variable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	@Qualifier(value="nokia")
	private Mobile mobile;
	
	public void use() {
		System.out.println("person is using mobile");
		mobile.text();
	}
}
