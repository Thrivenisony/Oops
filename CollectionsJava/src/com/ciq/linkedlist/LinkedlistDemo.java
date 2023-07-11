package com.ciq.linkedlist;

import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("adhithya");
		ll.add("naresh");
		ll.add("thriveni");
		ll.addFirst(5);
		ll.addLast("thrirunagiri");
		ll.set(4,"sony");
//		ll.removeLast();
//		ll.removeFirst();
		ll.offerFirst("sonythriveni");
		
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		
		System.out.println(ll);
	}

}
