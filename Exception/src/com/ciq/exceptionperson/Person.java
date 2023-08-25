package com.ciq.exceptionperson;

public class Person {
	private int id;
	private String name;

public Person() {
	if(id==0||name.isEmpty()) {
		System.out.println("id and name can't be empty");
	}
	}

 public Person(int id,String name) {
	 if(id==0||name.isEmpty()) {
		 System.out.println("id and name can't be empty");
	 }
	 this.id=id;
	 this.name=name;
	 
 }
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}
}
