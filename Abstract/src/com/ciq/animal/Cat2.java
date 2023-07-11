package com.ciq.animal;

public class Cat2 extends Animal2 {

	public Cat2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("cat eat"+name);
		
	}

	@Override
	public void drink() {
		System.out.println("cat drink"+name);
		
	}

	@Override
	public void sleep() {
		System.out.println("cat sleep"+name);
		
	}

}
