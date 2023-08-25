package com.ciq.json;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		
		Vector vector=new Vector();
		vector.addElement(true);

		vector.addElement(11);
		vector.addElement(120.35);
		vector.addElement(null);
		vector.addElement(new Employee(1,"thriveni",56512));
		Enumeration enumeratio=vector.elements();
		while(enumeratio.hasMoreElements()) {
			Object obj=enumeratio.nextElement();
			System.out.println(obj);
		}
	}

}
