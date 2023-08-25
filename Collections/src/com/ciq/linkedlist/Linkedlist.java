package com.ciq.linkedlist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Linkedlist {
	public static void main(String[] args) {
		List<Integer> prices=new ArrayList<>();
//		prices.add(500);
//		prices.add(100);
//		prices.add(200);
//		prices.add(700);
//		prices.add(600);
//		prices.add(400);
//		System.out.println(prices);
//		Collections.sort(prices);
//		System.out.println(prices);
		
		List<Employee> ae=new ArrayList<>();
		ae.add(new Employee(1, "thriveni", 2000));
		ae.add(new Employee(2, "adhi", 5000));
		ae.add(new Employee(3, "bhanu", 3000));
		ae.add(new Employee(4, "adhithya", 5000));
		ae.add(new Employee(5, "naresh", 3000));
		ae.add(new Employee(6, "sahithi", 5000));
		
//		System.out.println(ae);
//		Collections.sort(ae);
//		System.out.println("=================");
//        System.out.println(ae);
//        System.out.println("=================");
        for (Employee employee : ae) {
        	if(employee.getSalray()>=2000 && employee.getSalray()<=3000) {
        		System.out.println(employee);
        	}
        		
			
		}
		
	}

}
