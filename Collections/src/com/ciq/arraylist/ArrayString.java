package com.ciq.arraylist;

import java.util.ArrayList;

public class ArrayString {
	public static void main(String[] args) {
		ArrayList<String> product1=new ArrayList<String>();
		product1.add("mango");
		product1.add("Apple");
		product1.add("grapes");
		product1.add("bananna");
		System.out.println(product1);
		ArrayList<String> product2=new ArrayList<String>();
		product2.add("mango");
		product2.add("Apple");
		product2.add("grapes");
		product2.add("bananna");
		System.out.println(product2);
		boolean bl=product1.equals(product2);
		System.out.println(bl);
		product2.add("papaya");
		boolean b2=product1.equals(product2);
		System.out.println(b2);
		
		
		
	}

}
