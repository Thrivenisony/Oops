package com.ciq.json;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JacksonDataWriting {
	public static void main(String[] args) throws IOException {
		
	
	Employee emp1=new Employee(1, "thriveni", 500000);
	ObjectMapper om=new ObjectMapper();
  FileOutputStream fos=new FileOutputStream("emp5.json");
  om.writeValue(fos, emp1);
  
  String output=om.writeValueAsString(emp1);
  System.out.println(output);
  fos.close();
  ObjectMapper omp=new ObjectMapper(); 
   FileInputStream fis=new FileInputStream("emp8.json");
   int i=0;
   while((i=fis.read())!=-1) {
	   System.out.print((char)i);
   }
  


  
  


   


	}

  
}
