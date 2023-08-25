package com.ciq.json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUsingArray {
	public void Jacksonwriting() throws IOException {

		Employee emp1=new Employee(1, "thriveni", 30000);
		Employee emp2=new Employee(2, "adhithya", 40000);
		Employee emp3=new Employee(3, "naresh", 50000);
		Employee emp4=new Employee(4, "shekhar", 60000);
		Employee[] emp= {emp1,emp2,emp3,emp4};
		 ObjectMapper om=new ObjectMapper();
		 FileOutputStream fos=new FileOutputStream("employee15.json");
		 om.writeValue(fos, emp);
		 String output=om.writeValueAsString(emp);
		 System.out.println(output);
		
	}
	
	public static void main(String[] args) throws IOException {
		ObjectMapper om1=new ObjectMapper();
		Employee[] emp=new Employee[2];
		
		 FileInputStream fis=new FileInputStream("employee15.json");
			emp=om1.readValue(fis, Employee[].class);
			for (Employee employee : emp) {
				System.out.println(employee);
				
			}
			 
		
	}

}
