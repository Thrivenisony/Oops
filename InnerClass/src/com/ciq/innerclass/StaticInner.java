package com.ciq.innerclass;

public class StaticInner {
	int a=10;
	void msg() {
		System.out.println("hello");
	}
	
	static class Inner{
		 int b=20;
		 
		 void staticmsg() {
			 System.out.println("static msg");
			 System.out.println(b);
		
			  }
		
		}
	void msg2() {
		System.out.println(a);
		System.out.println("static msg two");
	}
	 public static void main(String[] args) {
		StaticInner.Inner st=new StaticInner.Inner();
		st.staticmsg();
		
		StaticInner si=new StaticInner();
		si.msg();
		si.msg2();
		
		
		
	}

}
