package com.ciq.treemap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreemapDemo {
	
	public static void main(String[] args) {
	  TreeMap<String, EmployeeTree> tm=new TreeMap<>();
	  tm.put("Thriveni003", new EmployeeTree(3,"Thrveni",20000));
	  tm.put("Sahithi002", new EmployeeTree(2, "Sahithi", 500000));
	  tm.put("Sai004", new EmployeeTree(4,"Thrveni",20000));
	  tm.put("Prasad001", new EmployeeTree(1, "Sahithi", 500000));
	  System.out.println(tm);
	  System.out.println("*********************");
	  
	  TreeMap<EmployeeTree,String> tm2=new TreeMap<>();
	  tm2.put(new EmployeeTree(3,"Thrveni",20000),"Thriveni003");
	  tm2.put( new EmployeeTree(2, "Sahithi", 500000),"Sahithi002");
	  tm2.put(new EmployeeTree(4,"Thrveni",20000),"Sai004");
	  tm2.put(new EmployeeTree(1, "Sahithi", 500000),"Prasad001");
	  System.out.println(tm);
	  
	  Iterator<Entry<EmployeeTree, String>> itr=tm2.entrySet().iterator();
	  while(itr.hasNext());
	  System.out.println(itr.next());
	  
	   Set<EmployeeTree> keySet = tm2.keySet();
		for (Entry<EmployeeTree, String> emps : tm2.entrySet()) {
		EmployeeTree key = emps.getKey();
			String empId=emps.getValue();
			if (empId==null && empId.isBlank()) 
			if(key.getId()==0 && key.getName().isBlank()&& key.getSalary()==0.0)
			{
				throw new NullPointerException("employee not found....");
		} else {
			System.out.println(emps.getKey() + " " + emps.getValue());
		}
		}
	}

}
