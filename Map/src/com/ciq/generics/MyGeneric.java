package com.ciq.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.ciq.employeetask.Employee;

public class MyGeneric<Object,Object1> {
	
	private Object Obj;
	private Object1 obj1;
	
	public MyGeneric(Object obj,Object1 obj1) {
		 this.Obj=obj;
		 this.obj1=obj1;
		 }
	
	public Object getobj() {
		 return Obj;
	 }
	 public void setobj(Object obj) {
		 this.Obj=obj;
	 }
	 public Object1 getobj1() {
		 return obj1;
	 }
	 public void setobj1(Object1 obj1) {
		 this.obj1=obj1;
	 }
	@Override
	public String toString() {
		
		return "MyGeneric[obj= " + Obj + ", obj1="+ obj1 + "]";
		
	}
	
	public static void main(String[] args) {
		MyGeneric<String,Integer>m1=new MyGeneric<String, Integer>("dd",100);
		MyGeneric<Double, String>m2=new MyGeneric<Double, String>(50.00, "Mango");
		MyGeneric<Integer, Employee> m3=new MyGeneric<Integer, Employee>(1, new Employee(101, "Adhithya", 5000));
		MyGeneric<Integer, Employee> m4=new MyGeneric<Integer, Employee>(2, new Employee(102, "Thriveni", 6000.00));
		
	
	List ll=new ArrayList();
	ll.add(m1);
	ll.add(m2);
	ll.add(m3);
	ll.add(m4);
	
	Iterator a=ll.iterator();
	while(a.hasNext()) {
		System.out.println(a.next());
	}
	
	
		
		
		
		
		
	} 
	 
	

}
