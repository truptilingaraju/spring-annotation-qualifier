package com.ty.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Baby {

	IceCream iceCream;

	@Autowired	
	public Baby( @Qualifier(value = "vanilla")IceCream iceCream)  {
		this.iceCream = iceCream;
	}
	
	public void like() {
		System.out.print("baby likes to eat ");
		iceCream.eat();
	}
	
}
