package com.ciq.listdemo;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add("add");//used to add a paticular object or we can add null
        System.out.println(arr);
        ArrayList<Object> arr1=new ArrayList<>();
        arr1.add("a");
        arr1.add("b");
        arr1.addAll(arr);//used to add all objects from arr collection.
        System.out.println(arr1);
        arr1.remove("b");//removing paticular object from arr1
        System.out.println(arr1);
        arr1.removeAll(arr);//removing all the objects from arr from arr1 and also we can remove all the object from same collections.
        System.out.println(arr1);
        System.out.println(arr.contains(1));//it returns true if the object present in list-arr      
	    System.out.println(arr1.containsAll(arr));//it returns true if the list-arr1 contains all the elements in the list-arr
	}

}
