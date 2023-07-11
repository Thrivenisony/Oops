package com.ciq.Innerclasses;

//Member inner class
//Local inner class
//Anonymous inner class
//static inner class
public class Outer {
	
	int outer=20;
	
	class Inner {
		int inner=10;
		void innermethod() {
			System.out.println(inner);
			System.out.println("innermethod");
			
			System.out.println(outer);
			
		}
	}
	
	void outermethod() {
		System.out.println("outermethod");
	}
	
	
	
	
	

}
