package com.ciq.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		Vector vector1=new Vector();
		vector1.addElement(10);
		vector1.add(null);
		vector1.addElement(true);
		vector1.addElement(25.2);
		vector1.addElement(null);
		vector1.addElement(new Employee(1, "Thriveni", 3000));
		System.out.println(vector1);
		vector1.addElement(10);
		vector1.addElement(true);
		vector1.addElement(25.2);
		vector1.addElement('c');
		//vector1.clear();
		vector1.addElement(new Employee(2, "Thriveni", 3000));
		vector1.addElement(10);
		vector1.addElement(true);
		vector1.addElement(25.2);
		vector1.addElement('c');
		vector1.addElement(new Employee(3, "Thriveni", 3000));
		Enumeration enumeration=vector1.elements();
		while(enumeration.hasMoreElements()) {
			Object obj=enumeration.nextElement();
			System.out.println(obj);
		}
		System.out.println(vector1.capacity());
		System.out.println(vector1.size());
		Vector vector2=new Vector();
		
		vector2.add("java");
		vector2.add("c");
		vector2.add("python");
		vector2.add("cobol");
		if(vector2.contains("java")) {
			System.out.println("java is present of index:"+vector2.indexOf("java"));
			
		}
		else {
			System.out.println("java is not present in the list");
		}
		Enumeration enumation=vector2.elements();
		while(enumation.hasMoreElements()) {
			Object obj2=enumation.nextElement();
			System.out.println(obj2);
		}
		System.out.println(vector2);
		System.out.println("*************************");
		Vector vector3=new Vector();
	vector3.add(100);
	vector3.add(200);
	vector3.add(30);
	vector3.add(40);
	
	int sum=0;
	for (Object object : vector3) {
		Integer value=(Integer) object;
		sum=sum+value;
	}
	System.out.println(sum);
	
	  Vector vector4=new Vector();
	  vector4.add(1);
      vector4.add(2);
		vector4.add(3);
		vector4.add(4);
		System.out.println("vector3 and vector 4 is equal?"+vector3.equals(vector4));
	  
		
	}
		
	}


