package com.ciq.construtor;

public class TestS {
	static int i=10;
	int a=20;
	
	public static void main(String[] args) {
		
		Static s=new Static();
		System.out.println(s.a);
		System.out.println(TestS.i);
		System.out.println(Static.name);
	}

}
