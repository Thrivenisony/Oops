package com.ciq.practiceprograms;

public class ConstructorChaining {
	int x;
	int y;
	
	
  public ConstructorChaining() {
	System.out.println("default construtor");
}

public ConstructorChaining(int x) {
this();
System.out.println("parameter constructor x");
	this.x = x;
	
}

public ConstructorChaining(int x, int y) {
	this(x);
	System.out.println("paramenter construtor x and y");
	this.x = x;
	this.y = y;
	
}

  public static void main(String[] args) {
	ConstructorChaining cn=new ConstructorChaining(100,200);
	System.out.println(cn.x+" "+cn.y);
	
}
}
