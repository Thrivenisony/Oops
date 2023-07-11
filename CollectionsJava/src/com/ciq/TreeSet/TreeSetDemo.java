package com.ciq.TreeSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> fruits=new TreeSet<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("green apple");
		fruits.add("grapees");
		fruits.add("peech");
		fruits.add("pandu");
		fruits.add("pomagranate");
		System.out.println(fruits);
//		System.out.println(fruits.lower("peech"));
//		System.out.println(fruits.lower("pomagranate"));
//		System.out.println(fruits.lower("apple"));
//		System.out.println(fruits);
//		System.out.println(fruits.higher("grapees"));
//		System.out.println(fruits.higher("apple"));
//		
//		NavigableSet<String> navigable=fruits.descendingSet();
//		Iterator<String> iterator=navigable.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		SortedSet<String> subset=fruits.subSet("a","m");
		System.out.println(subset);
	}

}
