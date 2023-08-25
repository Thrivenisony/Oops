package com.ciq.exceptionpersonex;

public class Person {
	private int id;
	private String name;
	public Person() {
		if(id==0||name.isEmpty()) {
			System.out.println("id and name cannot be empty");
		}
	}
		
	public Person(int id, String name) {
		if(id==0||name.isEmpty()) {
		System.out.println("id and name cannot be empty");	
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
	

}
