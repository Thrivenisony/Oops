package com.ciq.variables;

public class Variables {
	static {
		int b=50;
		System.out.println(b);
	}
	int c=60;
	
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		Variables v2=new Variables();
		System.out.println(v2.c);
		
	}
}

