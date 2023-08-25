package com.ciq.json;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;



public class GsonTest {
public static void main(String[] args) throws IOException {
//	Employee emp=new Employee(1, "adhi", 30000);
//	System.out.println(emp);
//	Gson gs=new Gson();
//	String json=gs.toJson(emp);
//	System.out.println(json);
//	FileWriter fw=new FileWriter("emp8.json");
//	gs.toJson(emp,fw);
//	fw.close();
//	System.out.println(json);
	
	Employee emp=new Employee(1, "thriveni",3000);
	Employee emp1=new Employee(2, "thriveni",3000);
	Employee emp2=new Employee(3, "thriveni",3000);
	Employee emp3=new Employee(4, "thriveni",3000);
	Employee emp4=new Employee(5, "thriveni",3000);
	Employee[] empl= {emp,emp1,emp2,emp3,emp4};
	
	System.out.println(empl);
	Gson gs=new Gson();
	String json=gs.toJson(empl);
	System.out.println(json);
	FileWriter fw=new FileWriter("thriveniemp.json");
	gs.toJson(empl,fw);
	fw.close();
	System.out.println(json);
	
	
	
}
}
