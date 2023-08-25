package com.ciq.encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		
//		Student  s=new Student(1, "Triveni");
		
		//argumented constructor
		Student s1=new Student(3,"Yamini");
		//no-arg
		Student s2=new Student();
		s1.setId(1);
		
		System.out.println(s1.getId());
		
		// by default jvm provides no-arguments constructor
		
		
	
		

	}

}
