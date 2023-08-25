package com.ciq.json;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonArrayUsing {
	
	public void Jacksonwriting() throws IOException {
		
//		ObjectMapper om1=new ObjectMapper();
//		Employee[] emp=new Employee[2];
//		FileInputStream fis=new FileInputStream("employee.json");
//		emp=om1.readValue(fis, Employee[].class);
//		for (Employee employee : emp) {
//			
// 			System.out.println(employee);
//
//		}
	}
	
	
	public static void main(String[] args) throws IOException {

		Employee emp1=new Employee(1, "thriveni", 30000);
		Employee emp2=new Employee(2, "adhithya", 40000);
		Employee emp3=new Employee(3, "naresh", 50000);
		Employee emp4=new Employee(4, "shekhar", 60000);
		
		Employee[] emp= {emp1,emp2,emp3,emp4};
		 ObjectMapper om=new ObjectMapper();
		 
		 FileOutputStream fos=new FileOutputStream("employeadhi.json");
		 om.writeValue(fos, emp);
		 
		 
		 String output=om.writeValueAsString(emp);
		 System.out.println(output);
		 
		 
		 FileInputStream fis=new FileInputStream("employeadhi.json");
		 emp=om.readValue(fis,Employee[].class);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
////		  for reading the data
//		 FileInputStream fis=new FileInputStream("employee15.json");
//		emp=om.readValue(fis, Employee[].class);
//		 
//		 
//		 // for writing the data
//		 FileOutputStream fos=new FileOutputStream("employee16.json");
//		 om.writeValue(fos, emp);
//		 
//
//		 String output=om.writeValueAsString(emp);
//		 System.out.println(output);
		}
		
		
	

	}

