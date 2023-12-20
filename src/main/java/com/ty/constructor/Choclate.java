package com.ty.constructor;

import org.springframework.stereotype.Component;

@Component
public class Choclate implements IceCream {
 
	public void eat() {
		System.out.println("choclate icecream");
	}
}
