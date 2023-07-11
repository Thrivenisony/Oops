package com.ciq.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("banana");
		ad.addFirst("Apple");
		ad.addLast("kiwi");
		ad.offerFirst("cherry");
		ad.offerLast("pomagranate");
		ad.offer("mango");
		//System.out.println(ad);
		//peek
//		System.out.println(ad.peek());
//		System.out.println(ad.peekFirst());
//		System.out.println(ad.peekLast());
	
		//pool remove
		
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad); 
		
		//
		System.out.println(ad.size());
		ad.clear();
		System.out.println(ad);
		System.out.println(ad.isEmpty());
		
	}
	

}
