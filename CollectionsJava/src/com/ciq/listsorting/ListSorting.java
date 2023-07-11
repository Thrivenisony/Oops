package com.ciq.listsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("grapes");
		list.add("babana");
		list.add("apple");
		list.add("mango");
//		//list.add(null);
//		//list.add(12);
//		Collections.sort(list);
//		System.out.println(list);
		
		Collections.sort(list,new Mycomparator());
		System.out.println(list);
	}

}
