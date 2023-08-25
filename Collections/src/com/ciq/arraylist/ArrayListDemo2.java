package com.ciq.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> prices=new ArrayList<Integer>();
		prices.add(100);
		prices.add(50);
		prices.add(200);
		prices.add(80);
		prices.add(10);
		prices.add(100);
		prices.add(null);
		
		System.out.println(prices);
		int oldc=15;
		int newcapacity=(oldc*3)/2+1;
		System.out.println(newcapacity);
		
//		for(int i=0;i<prices.size();i++) {
//			System.out.println(prices.get(i));
//		}
//		System.out.println("***************");
	
//		int sum=0;
//		for (Integer integer : prices) {
//			Integer value=(Integer) integer;
//			sum=sum+value;
//		}
//		System.out.println(sum);
////		
//		
		ArrayList<String> product=new ArrayList<String>();
		product.add("mango");
		product.add("Apple");
		product.add("grapes");
		product.add("bananna");
		for (String string : product) {
			System.out.println(string);
		}
		
		
//		System.out.println("***************");
//		
//		ArrayList<Object> graclist=new ArrayList<Object>(prices);
//		graclist.add(product);
//		for (Object object : graclist) {
//			System.out.println(object);
	}
//				}
//	//prices.add('c');
//	prices.add("adhithya");
//	prices.add(15.2);
}
