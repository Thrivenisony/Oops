package com.ciq.access;

import com.ciq.construtors.Employeetest;

public class Prot {
	int id;
	String name;
	{
	System.out.println("instance");
	{
		System.out.println("nestead");
	}
	}
	
	
	static {
		System.out.println("static");
	}
	
	void aa() {
		{
		System.out.println("local-method");	
		}
	}
	public Prot() {
		// TODO Auto-generated constructor stub
	}
	public Prot(int id,String name) {
		this.id=id;
		this.name=name;
		{
		System.out.println("default constructer");
	}
	}
	public void display() {		
		System.out.println(id+name);
	}
//	 protected void setName(String name) {
//		 this.name=name;
//		 {
//			System.out.println("local-con"); 
//		 }
//	 }
	 public static void main(String[] args) {
		Prot pr=new Prot();
		pr.aa();
		Prot pr2=new Prot(1,"adhi");
		pr2.display();
//		System.out.println(pr2.id);
//		System.out.println(pr2.name);
//		
		
		
	}

}
