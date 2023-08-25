package com.ciq.variables;

public class Variables2 {
	
	// variables 3 types
	// 1)local variables(inside class inside method)
	//2)instance variable(inside class outside method)
	//3)static variables(inside static block)
	
	
	//static  variable
	static {
		int b=20;
		System.out.println(b);
		
	}
	
	int c=30;
	
	
	public static void main(String[] args) {
//		local variable
		int a=10;
		System.out.println(a);
		
		//object(or)instance
		Variables2 v2=new Variables2();
		System.out.println(v2.c);
		
		
		
		
		
		
	}

}
