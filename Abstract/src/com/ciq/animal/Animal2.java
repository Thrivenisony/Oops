package com.ciq.animal;

public abstract class Animal2 {
	String name;
	public Animal2(String name) {
		this.name=name;
	}
public abstract void eat();
public abstract void drink();
public abstract void sleep();
public static  void Animaltype(String Animaltype) {
	System.out.println("animal type:"+Animaltype );
}
//non absract method
//we can create abstract and non absract methods
public String getName() {
	return name;
}
}