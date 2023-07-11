package com.ciq.daolayer;



import java.util.Set;

import com.ciq.pojo.StudentSubject;

public class Student {
	   private int id;
	   private String name;
	   private String email;
	   private Set<StudentSubject> subs;
	   public Student() {
		
	}
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Set<StudentSubject> getSubs() {
		return subs;
	}
	public void setSubs(Set<StudentSubject> subs) {
		this.subs = subs;
	}
	public Student(int id, String name, String email, Set<StudentSubject> subs) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subs = subs;
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
	public String getEmail() {
		return email;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
//	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", subs=" + subs + "]";
	}
	  

}
