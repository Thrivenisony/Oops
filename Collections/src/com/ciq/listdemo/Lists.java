package com.ciq.listdemo;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);//adding element into a list
		list.add(1,1);//adding the specified element at the specified position in the list
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.set(3, "element2");//updating the specified element in the paticular index by deleting the old element present in that index
		System.out.println(list);
		List<Object> list1=new ArrayList<>();
		list1.add(null);
		list1.addAll(list);//adding all elements in the list to list1.
		System.out.println(list1);
		list1.addAll(1, list);//from index 1 all elements in the list is added to list1
		System.out.println(list1);
		
	}

}
