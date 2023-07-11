package com.ciq.animal;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("cat eat food");
		
	}

	@Override
	public void drink() {
		System.out.println("cat drink water");
		
	}

	@Override
	public void sleep() {
		System.out.println("cat sleep");
		
	}

}
