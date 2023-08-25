package com.ciq.construtors;

public class Employee {
 int id;
 String name;
 double salary;
 public Employee() {
	// TODO Auto-generated constructor stub
}
 public Employee(int id,String name,double salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	
	}
 public void displayemp() {
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(salary);
 }

}

