package com.ciq.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class EmpTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "thriveni", 30000);
		Employee emp2 = new Employee(2, "sahithi", 40000);
		Employee emp3 = new Employee(3, "priya", 50000);
		Employee emp4 = new Employee(4, "latha", 60000);
		Employee emp5 = new Employee(5, "priya", 50000);
		Employee emp6 = new Employee(6, "latha", 60000);
		Employee emp7 = new Employee(5, "priya", 50000);
		Employee emp8 = new Employee(6, "latha", 60000);

		//HashSet<Employee> hs = new HashSet<Employee>();
		TreeSet<Employee> hs=new TreeSet<>();
		
		hs.add(emp1);

		hs.add(emp2);

		hs.add(emp3);

		hs.add(emp4);
		hs.add(emp5);

		hs.add(emp6);
		hs.add(emp7);

		hs.add(emp8);


		// System.out.println(hs);
		for (Employee employee : hs) {
			System.out.println(employee);
		}

	}

}
