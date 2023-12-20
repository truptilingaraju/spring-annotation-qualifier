package com.ty.variable;


import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile {

	public void text() {
		System.out.println("nokia is texting");
	}
}
