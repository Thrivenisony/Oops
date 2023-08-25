package com.ciq.inputandoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeBufferedwriterDemo {
	private static final String PATH="D:\\";
	public static void main(String[] args) {
		
	Employee employee=new Employee(1, "thriveni", 30000.00);
	 File file=new File (PATH+"employee.txt");
	 System.out.println(file.getAbsolutePath());
	  System.out.println(file.getName());
 try(BufferedWriter bw=new BufferedWriter(new FileWriter(file));){
   char[] chars=employee.toString().toCharArray();
     bw.write(chars);
  }
 catch(IOException e) {
  e.printStackTrace();  }
 try(BufferedReader br=new BufferedReader(new FileReader(file));){
	 int i=0;
	 while((i=br.read())!=-1) {
		 System.out.print((char)i);
		 
	 }
	 
 } catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	
	e.printStackTrace();
}
   
  
	}
		
	}

	
	
	
	


