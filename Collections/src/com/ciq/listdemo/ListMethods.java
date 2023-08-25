package com.ciq.listdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListMethods {

	public static void main(String[] args) {
		List list1 = new ArrayList ();
		list1.add(0);//adding the element
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(1,4);//adding the element with a paticular index
		                //  when we add "s" in index-1 remaning elements in the list
		                //shifted towards right side.
		System.out.println(list1);
		List list2=new ArrayList();
		list2.add(1.1);
		list2.add("a");
		list2.add(1.1);
		list2.add(null);
		System.out.println(list2);
		list2.addAll(list1);//getting all elements from list1 and add to the list2
		list2.addAll(1, list1);//from index-1 all the elements from list-1 is added to list-2
		System.out.println(list2);
		System.out.println(list2.contains(null));//To check whether the object is present in the list
	System.out.println(list2.containsAll(list1));//to check whether the list-1 is present in the list-2 or not
	System.out.println(list2.equals(list1));//to check lists are equal are not
	System.out.println(list2.get(6));//fetching the 6th index element from list-2
	System.out.println(list2);
	System.out.println(list2.indexOf(2));//fetching the index of paticular element.
	System.out.println(list2.lastIndexOf(1.1));//if there are duplicate elements this method performs to return the index of the last duplicate element.
	System.out.println(list2.isEmpty());//to check list is empty 
	System.out.println(list2.remove(4));//to remove the element in 4rth index.
	System.out.println(list2.set(5, 3));//at index-5 old object will be deleated and new object will be stored
	System.out.println(list2);
//from index-2 the elements are got fetched(iterated)
	ListIterator<Integer> iterator=list1.listIterator(2);
	while(iterator.hasNext()) {
		Integer i=iterator.next();
		System.out.println(i);
	}

	}
}


