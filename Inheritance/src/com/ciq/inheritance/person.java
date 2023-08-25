package com.ciq.inheritance;

public class person extends passport{
int id;
String name;
int age;
public void biodata() {
	System.out.println("person id:"+id);
	System.out.println("person name:"+name);
	System.out.println("person age:"+age);
}

@Override
	public void applyPassport(String validate) {
		super.applyPassport(validate);
	}
}

