package com.ciq.animal;

public class Elephant implements Animal {

	@Override
	public void eat() {
		System.out.println("elephant eat food");
		
	}

	@Override
	public void drink() {
		System.out.println("elephant drink water");
		
	}

	@Override
	public void sleep() {
		System.out.println("elephant sleep");	
	}

}
