package com.ciq.animal;

public class BirdTest {
	public static void main(String[] args) {
		
		Parrot pt=new Parrot("Bird");
		pt.fly();
		pt.sleep();
		pt.eat();
		pt.getName();
		Penguin pg=new Penguin("tom");
		pg.swim();
		pg.eat();
		pg.sleep();
		
		
	}

}
