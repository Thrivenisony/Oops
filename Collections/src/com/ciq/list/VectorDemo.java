package com.ciq.list;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo{
	public static void main(String[] args) {
		Integer[] arr=new Integer[] {1,5,6,4,2,6,4};
		Vector <Integer> v1=new Vector<Integer>(Arrays.asList(arr));
		//v1.add("adhithya");
//		v1.add("shekhar");
	//	int sum=0;
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
//			sum+=(Integer)v1.get(i);
//		}
//		
		//  System.out.println(v1);
		
//		Vector v2=new Vector();
//		v2.add("Thriveni");
//		v2.add(0,"sony");
//		v2.add(0,"naresh");
//		v2.add("sony");
//		v2.add("sony");
//		
//		Vector v3=new Vector();
//		v3.add("Thriveni");
//		v3.add(0,"sony");
//		v3.add(0,"naresh");
//		v3.add("sony");
//		//v3.add("java");
		
	//	System.out.println(v1.get(1));
		//v1.set(1, "chandu");
//		System.out.println(v1);
//		System.out.println(v1.get(1));
//		
		
		//v1.addAll(0,v2);
//		System.out.println(v1.indexOf("sony"));
//		System.out.println(v1.lastIndexOf("sony"));
//	System.out.println(v1.firstElement());
//	System.out.println(v1.lastElement());
//	System.out.println(v1);
//	System.out.println(v1.get(1));
//		v1.remove(0);
//		System.out.println(v1);
//		v1.remove("sony");
//		//v1.removeAll(v2);
//		System.out.println(v1);
		//v1.clear();
		//System.out.println(v1.contains("shekhar"));
		
//		for(int i=0;i<v2.size();i++) {
//			v1.add(v2.get(i));
//	
//		}
//		System.out.println(v1);
//		System.out.println(v1.containsAll(v3));
System.out.println("size:"+v1.size());
System.out.println("capacity:"+v1.capacity());
//Object[] arr=v1.toArray();
//System.out.println(Arrays.toString(arr));
//		
}

}
