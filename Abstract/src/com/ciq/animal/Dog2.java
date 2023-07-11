package com.ciq.animal;

public class Dog2 extends Animal2 {

	public Dog2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("dog eat"+name);
		
	}

	@Override
	public void drink() {
		System.out.println("dog drink"+name);
		
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep"+name);
		
	}

}
