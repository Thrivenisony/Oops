package com.ciq.inheritancedemo;

public class B extends A {

	public void bm() {
		System.out.println("b prop");
	}
	
	@Override
	public void am() {
		//System.out.println("bbbbbb");
		super.am();
	}
}
