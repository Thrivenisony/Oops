package com.ciq.throwkeyword;

public class Customer {
	private int id;
	private String name;
	public Customer(int id, String name) { 
		if(id==0||name.isBlank()) {
			throw new IllegalArgumentException("please enter a value");
			
		}
	
		this.setId(id);
		this.setName(name);
	}
	public Customer() {
		if(id==0||name==null) {
			throw new IllegalArgumentException("please enter a value");
			
		}
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
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Customer customer=new Customer(10,"thriveni");
		System.out.println(customer);
	}

}
