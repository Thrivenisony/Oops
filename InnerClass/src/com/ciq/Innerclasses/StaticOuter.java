package com.ciq.Innerclasses;

public class StaticOuter {

	
	  int a=10;
	 
	 static class staticinner {
		 
		 int b=30;
		 
		 void staticinnermethod() {
//			 System.out.println(a);
			 System.out.println("static inner class");
		 }
		 
		 
	 }
	 
	 void staticouterm() {
		 System.out.println("static outer");
		 
	 }
	
	
}
