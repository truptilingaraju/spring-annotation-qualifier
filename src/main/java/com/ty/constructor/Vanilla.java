package com.ty.constructor;

import org.springframework.stereotype.Component;

@Component
public class Vanilla implements IceCream {

	public void eat() {
		System.out.println("vanilla icecream");
	}

}
