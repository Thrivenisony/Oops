package com.ciq.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedhashsetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Sahithi");
		lhs.add("Thriveni");
		lhs.add("priya");
		lhs.add("adhithya");
		lhs.add(null);
		lhs.add("adhithya");
		Iterator<String> iterator=lhs.iterator();
		while(iterator.hasNext()) {
			//lhs.add("adhi");
			System.out.println(iterator.next());
		}
		CopyOnWriteArrayList<String> coa=new CopyOnWriteArrayList<>();
		coa.add("abc");
		coa.add("Sahithi");
		coa.add("Thriveni");
		coa.add("priya");
		coa.add("adhithya");
		Iterator<String> iterator1=coa.iterator();
		while(iterator1.hasNext()) {
			coa.add("adhi");
			System.out.println(iterator1.next());
		}
		
	}

}
