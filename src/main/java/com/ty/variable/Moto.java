package com.ty.variable;


import org.springframework.stereotype.Component;

@Component
public class Moto implements Mobile {

	public void text() {
		System.out.println("moto is texting");		
	}
}
