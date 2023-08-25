package com.ciq.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
public static void main(String[] args) {
	Integer[] arr1=new Integer[] {1,3,2,4,5};
	ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr1));
	al.add(12);
	al.add((int) 20.5);
	al.add(null);
	al.add(0,11);
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	for (Integer integer : al) {
		System.out.print(integer+" ");
	}
	//System.out.println(al);
	System.out.println(al.size());
	
	

}
}
