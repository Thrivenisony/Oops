package com.ciq.InnerClass;

public class Test {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.InnerClass innerref = outer.new InnerClass();
		
		outer.setId(20);
		outer.setname("ramu");
		
		innerref.setColor("green");
		innerref.getcolor();

	}
	}