package com.ciq.immutable;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String>hobies;
	public Student(int id, String name, List<String> hobies) {
		super();
		this.id = id;
		this.name = name;
		this.hobies = hobies;
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
	public List<String> getHobies() {
		return hobies;
	}
	public void setHobies(List<String> hobies) {
		this.hobies = hobies;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hobies=" + hobies + "]";
	}
	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("singing");
		li.add("reading");
		Student s1=new Student(1,"Thriveni", li);
		System.out.println(s1);
		
	}

}
