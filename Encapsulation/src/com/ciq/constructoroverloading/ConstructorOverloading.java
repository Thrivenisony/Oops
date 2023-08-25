package com.ciq.constructoroverloading;

public class ConstructorOverloading {
	
	private int id;
	private String fname;
	private String lName;
	private double fees;
	
	public ConstructorOverloading() {
		
	}
	ConstructorOverloading(int id){
		this.id=id;
	}
	public ConstructorOverloading(int id, String fname) {
		super();
		this.id = id;
		this.fname = fname;
	}
	public ConstructorOverloading(int id, String fname, String lName) {
		super();
		this.id = id;
		this.fname = fname;
		this.lName = lName;
	}
	public ConstructorOverloading(int id, String fname, String lName, double fees) {
		super();
		this.id = id;
		this.fname = fname;
		this.lName = lName;
		this.fees = fees;
	}
	public ConstructorOverloading(String fname, String lName) {
		super();
		this.fname = fname;
		this.lName = lName;
	}
	
	
	
	
	

}
