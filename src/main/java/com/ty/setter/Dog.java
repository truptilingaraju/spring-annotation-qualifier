package com.ty.setter;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	public void eat() {
		System.out.println("dog is eating");
	}
}
