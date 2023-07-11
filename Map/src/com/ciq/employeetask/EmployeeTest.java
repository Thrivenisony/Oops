package com.ciq.employeetask;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {
	public static void main(String[] args) {
		Department dpHR = new Department(101, "HR", "hyd");
		Department dpIT = new Department(102, "IT", "pune");
		Department dpHR2 = new Department(103, "HR2", "Bangalore");
		Department dpIT2 = new Department(104, "IT2", "Chennai");

		Employee admin = new Employee(10, "Archana", 500000, dpIT);
		Employee lead = new Employee(12, "Adhithya", 100000, dpIT);
		Employee Manager = new Employee(13, "Thriveni", 500000, dpIT);
		Employee developer = new Employee(12, "Naresh", 100000, dpIT);
		Employee recruiter = new Employee(10, "Anjali", 500000, dpHR);
		Employee HR = new Employee(12, "Sheshavatharam", 100000, dpHR);
		Employee recruiter2 = new Employee(13, "Laxmi", 500000, dpHR2);
		Employee HR2 = new Employee(12, "Shekhar", 100000, dpHR2);
		Employee developr2 = new Employee(13, "Sathyanarayana", 500000, dpIT2);
		Employee developr3 = new Employee(12, "Sahithi", 100000, dpIT2);

		Map<Employee, String> employee = new HashMap<Employee, String>();
		employee.put(admin, "DpIT admin pune");
		employee.put(lead, "DpIT Lead pune");
		employee.put(Manager, "DpIT manager pune");
		employee.put(developer, "DpIT developer pune");
		employee.put(recruiter, "DpHR Recruiter hyd");
		employee.put(HR, "DpHr Hyd");
		employee.put(recruiter2, "DpHR2 Bangalore");
		employee.put(HR2, "DpHR2 Bangalore");
		employee.put(developr2, "DpDeveloper2 Chennai");
		employee.put(developr3, "DpDeveloper3 Chennai");
		
		System.out.println("Salary based sorting---------------");

		Iterator<Entry<Employee, String>> salaryBased = employee.entrySet().iterator();
		while (salaryBased.hasNext()) {
			Map.Entry<Employee, String> entry = salaryBased.next();
			Employee emp = entry.getKey();
			if (emp.getSalaray() == 100000) {
				System.out.println(entry);
			}
		}
		
		Iterator<Entry<Employee, String>> salaryBased1 = employee.entrySet().iterator();

		while (salaryBased1.hasNext()) {
			
			Map.Entry<Employee, String> entry2 = salaryBased1.next();
			Employee emp1 = entry2.getKey();
			if (emp1.getSalaray() == 500000) {
				System.out.println(entry2);
			}
		}
		
		
		
		
		
		System.out.println("======================");

		List<Employee> empIT = new ArrayList<Employee>();
		empIT.add(admin);
		empIT.add(lead);
		empIT.add(Manager);
		empIT.add(developer);
		

		List<Employee> recruiters = new ArrayList<>();
		recruiters.add(recruiter);
		recruiters.add(recruiter2);

		List<Employee> Hrs = new ArrayList<>();
		Hrs.add(HR);
		Hrs.add(HR2);

		List<Employee> developers = new ArrayList<>();
		developers.add(developr2);
		developers.add(developr3);

		Map<Integer, List<Employee>> employee2 = new HashMap<>();
		employee2.put(1, empIT);
		employee2.put(2, recruiters);
		employee2.put(3, Hrs);
		employee2.put(4, developers);

		// System.out.println(recruiter);
//	    
//	    for(Map.Entry<Integer,List<Employee>> ref:employee2.entrySet()) {
//	    	List<Employee> name=ref.getValue();
//	    	for (Employee employee3 : name) {
//				if(employee3.getEname().startsWith("A")||employee3.getEname().endsWith("a")) {
//					System.out.println(employee3);
//				}
//			}
//	

		Iterator<Map.Entry<Integer, List<Employee>>> itr2 = employee2.entrySet().iterator();
		while (itr2.hasNext()) {
			Entry<Integer, List<Employee>> next = itr2.next();
			if (next.getKey() == 3 || next.getKey() == 2) {
				System.out.println(next);

			}

		}

	}

//		Iterator<Entry<Employee, String>> itr=employee.entrySet().iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

}
