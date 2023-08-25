package com.ciq.vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vector1=new Vector();
		vector1.add("Thriveni");
		vector1.add("sony");
		vector1.add("naresh");
		
		Vector vector2=new Vector();
		vector2.add("Adhithya");
		vector2.add("Shekhar");
		vector1.addAll(vector2);
		
       vector1.remove("sony");
       System.out.println(vector1);
	   vector1.removeAll(vector2);
		System.out.println(vector1);
		
		//System.out.println(vector1);
		
//				Vector vector3=new Vector();
//				vector3.add("Deepika");
//				vector3.add("Pavani");System.out.println(vector1.contains("sony"));
		//System.out.println(vector1.containsAll(vector2));
		
		
//				
	}

}
