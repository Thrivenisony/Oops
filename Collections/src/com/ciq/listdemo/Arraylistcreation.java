package com.ciq.listdemo;
import java.util.ArrayList;
public class Arraylistcreation {
      public static void main(String[] args) {
//1.it creates an array list objects.
//default capacity= 10; 
		ArrayList array=new ArrayList();
		array.add(1);
		array.add(1, "sa");
		System.out.println(array);
		System.out.println("...................");
//2.creates an array list object with the specified capacity
		ArrayList array1=new ArrayList(2);
		array1.add(2);
		array1.add(1);
		array1.add(3);
		System.out.println(array1);
		System.out.println("..............");
//once it reaches max capacity then a new array list object is created with the new capacity
// newCapacity=(oldCapacity*3)/2+1
//3.for inter conversion collection objects.
		ArrayList array2=new ArrayList<>(array);
	array2.add("sahithi");
	System.out.println(array2);
	}

}
