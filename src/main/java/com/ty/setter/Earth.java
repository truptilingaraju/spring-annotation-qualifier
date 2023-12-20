package com.ty.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Earth {


	private Animal animal;
	
	public Animal getAnimal() {
		return animal;
	}

	@Autowired
//	@Qualifier(value = "cow")
	@Qualifier(value = "dog")
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void rotate() {
		System.out.println("earth is rotating");
		animal.eat();
	}
}
