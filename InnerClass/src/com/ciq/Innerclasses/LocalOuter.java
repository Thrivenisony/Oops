package com.ciq.Innerclasses;

public class LocalOuter {

	int a=10;
	void outer() {
		System.out.println("outer");
		
		class LocalInner{
			int b=20;
			void inner() {
				System.out.println(a);
				System.out.println("inner");
			}
			
		}
		LocalInner l=new LocalInner();
		l.inner();
		
	}
	
}
