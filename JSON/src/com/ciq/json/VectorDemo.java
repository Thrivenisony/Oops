package com.ciq.json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("emp.json");
		FileInputStream fis2 = new FileInputStream("employee11.json");
		FileInputStream fis3 = new FileInputStream("employee15.json");
		FileInputStream fis4 = new FileInputStream("emp2.json");
		Vector vector = new Vector();
		System.out.println(vector.capacity());
//		vector.addElement(true);
//
//	vector.addElement(11);
//	vector.addElement(120.35);
//	vector.addElement(null);
//	vector.addElement(new Employee(1,"thriveni",56512));
//	Enumeration enumeratio=vector.elements();
//	while(enumeratio.hasMoreElements()) {
//		Object obj=enumeratio.nextElement();
//		System.out.println(obj);
//	}

	vector.addElement(fis1);
	vector.addElement(fis2);
		vector.addElement(fis3);
		vector.addElement(fis4);
		Enumeration enumeration = vector.elements();
		SequenceInputStream sis = new SequenceInputStream(enumeration);
		int i = 0;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
		}

	}
}
