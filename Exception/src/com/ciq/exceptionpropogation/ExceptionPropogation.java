package com.ciq.exceptionpropogation;

public class ExceptionPropogation {
	public void m1() {
		try {
		int divided=10/0;
		System.out.println("m1 method"+divided);
	}
		catch(Exception e) {
			System.out.println(e.getCause());
		}
	}
	public void m2() {
		m1();
		System.out.println("m2 method");
	}
	public void m3() {
		m2();
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		ExceptionPropogation ep=new ExceptionPropogation();
		//ep.m1();
		//ep.m2();
		ep.m3();
	}

}
