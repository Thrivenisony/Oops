package com.exceptionhandling;

public class Person {
	private int id;
	private String name;

	public Person() {
		if (id == 0 || name.isEmpty()) {
			System.out.println("ID AND NAME CAN'T ME EMPTY");
		}
	}

	public Person(int id, String name) {
		if (id == 0 || name.isEmpty()) {
			System.out.println("ID AND NAME CAN'T ME EMPTY");
		}
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
public static void main(String[] args) {
	Person p=new Person();
	Person p1=new Person(0, "");
	System.out.println(p);
	System.out.println(p1);
	
}
}


