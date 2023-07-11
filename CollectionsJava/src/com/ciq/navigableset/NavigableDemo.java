package com.ciq.navigableset;

import java.util.TreeSet;

public class NavigableDemo {
	public static void main(String[] args) {
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		treeset.add(100);
		treeset.add(200);
		treeset.add(300);
		treeset.add(500);
		treeset.add(400);
		treeset.add(600);
		System.out.println(treeset);
		System.out.println(treeset.ceiling(300));//300
		System.out.println(treeset.higher(500));//600
		System.out.println(treeset.floor(400));//400
		System.out.println(treeset.lower(600));//500
		System.out.println(treeset.pollFirst());//100-remove first ele
		System.out.println(treeset.pollLast());//600-remove last ele
		System.out.println(treeset.descendingSet());
	}

}
