package com.ciq.animal;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("dog eats food");
		
	}

	@Override
	public void drink() {
		System.out.println("dog drinks water");
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep");
		
	}

}
