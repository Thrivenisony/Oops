package com.ciq.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Traverse {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("a");
		list.add(2);
		list.add(3.0);
//using for loop to iterate list and get element by index
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("...............");
//using foreach loop 
		for (Object objects : list) {
			System.out.println(objects);
		}
		System.out.println("...............");
//using  iterator from list to iterate through its elements
		Iterator<Object> traverse=list.iterator();
		while(traverse.hasNext()) {
			System.out.println(traverse.next());
		}
		System.out.println("...............");
//using forEach of the list to iterate through its elements
		list.forEach(i -> {System.out.println(i+"");});
		System.out.println("...............");
//using forEach of stream of  list to iterate through its elements.
		list.stream().forEach(i -> {System.out.println(i + " ");});
	}

}
