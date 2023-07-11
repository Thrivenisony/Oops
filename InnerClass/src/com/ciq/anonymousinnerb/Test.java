package com.ciq.anonymousinnerb;

public class Test {

	public static void main(String[] args) {
		Bird b = new Bird() {

			@Override
			public void swim() {
				System.out.println("swim");
			}

			@Override
			public void fly() {
				System.out.println("fly");
			}
		};

		b.swim();
		b.fly();
	}
}
