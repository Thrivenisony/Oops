package com.ciq.accessmodifers;

public class Emp {
	 private int id;
	private String name;
	 
	public void setName(String name) {
		this.name=name;
	}
	 public void displayemp() {
		  System.out.println(id);
		  System.out.println(name);
	  }
public static void main(String[] args) {
		Emp em=new Emp();
		em.id=1;
		em.name="adhi";
		em.displayemp();
	}
	
	 

}
