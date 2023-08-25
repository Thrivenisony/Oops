package com.ciq.arraylist;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(100);
		al.add(100);
		al.add(null);
		al.add('c');
		al.add("adhithya");
		al.add(15.2);
		
		for (Object object : al) {
			System.out.println(object);
		}
		System.out.println("*****************************");
		
		Iterator iterator=al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("***************************");
		
		//java 8 lamba Expression
		al.forEach(System.out::println);
		
		System.out.println("***************************");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("***************");
		
		
		
		
//		Iterator iterator=al.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		//System.out.println(al.size());
		
	}

}
