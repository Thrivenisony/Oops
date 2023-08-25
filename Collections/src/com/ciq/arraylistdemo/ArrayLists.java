package com.ciq.arraylistdemo;


import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class ArrayLists {
	

		public static void main(String[] args) {
			// Homogeneous //generics --> type safety
			ArrayList<Integer> prices = new ArrayList<>(5);
			prices.add(250);// int or integer
			prices.add(100);
			prices.add(250);// int or integer
			prices.add(1000);
			prices.add(2500);// int or integer
			prices.add(10000);
			System.out.println("**********************************");
			for (Integer price : prices) {
				if (price >= 1000) {
					System.out.println(price);
				}
			}
			System.out.println("**********************************");

//			arrayList.add("Array List Class"); // remove
//			arrayList.add('M');
//			arrayList.add(true);
//			arrayList.add(144.3f); // float orFLoat
//			arrayList.add(2000.00);
			System.out.println(prices);
//			int oldCa=5;
//			int newc= (oldCa * 3)/2 + 1;
//			System.out.println(newc);

			// auto-boxing, how to provide type safety
			System.out.println("**********************************");
			int sum = 0;
			for (Object object : prices) {
//				Integer value = (Integer) object;
//				sum = sum + value;
			}
			System.out.println(sum);

			ArrayList<String> fruits = new ArrayList<String>();
			fruits.add("Apple");
			fruits.add("Mango");
			fruits.add("Banana");
			fruits.add("Orange");
			fruits.add("Promogranite");
			fruits.add("Grapes");
			fruits.add("Gowa");
			fruits.add("Green Apple");
			Collections.sort(fruits);
			System.out.println(fruits);
	// g---> 
			System.out.println("**********************************");
			for (String fruit : fruits) {
//				if (fruit.startsWith("g")) {
//					System.out.println(fruit);
//				}
				System.out.println(fruit);
			}

//			ArrayList<Object> groceryList=new ArrayList<Object>(prices);
//			groceryList.add(products);
//			
//			for (Object grocery : groceryList) {
//				System.out.println(grocery);
//			}
			int[] numbs = { 20, 10, 50, 40, 30 };
			Arrays.sort(numbs);
			System.out.println(Arrays.toString(numbs));
             Employee e5=new Employee();
			Employee e1 = new Employee(3, "anil", 12000);
			Employee e2 = new Employee(1, "balu", 12000);
			Employee e3 = new Employee(2, "charu", 12000);
			Employee e4 = new Employee(4, "dharma", 12000);

			Employee[] emps = { e1, e2, e3, e4 };
			Arrays.sort(emps);
			System.out.println("**********************************");
			for (Employee employee : emps) {
				System.out.println(employee);
			}

//			List<Employee> employees = new ArrayList<Employee>();
//			employees.add(e1);
//			employees.add(e2);
//			employees.add(e3);
//			employees.add(e4);
//			System.out.println("**********************************");
//			Collections.sort(employees);

//			for (Employee employee : employees) {
////				if(employee.getName().startsWith("a"))
//				if (employee.getSalray() >= 20000 && employee.getSalray() <= 30000)
//					System.out.println(employee);
//			}
		}

	}


