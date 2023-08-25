package com.ciq.inputandoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmployeeBufferedOutputStreamDemo {
	private static final String PATH="D:\\";
	public static void main(String[] args) {
		
	Employee employee=new Employee(1, "thriveni", 30000.00);
	 File file=new File (PATH+"employee.txt");
	 System.out.println(file.getAbsolutePath());
	  System.out.println(file.getName());
 try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file));){
   byte[] bytes=employee.toString().getBytes();
     bos.write(bytes);
  }
 catch(IOException e) {
  e.printStackTrace();  }
 try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));){
	 int i=0;
	 while((i=bis.read())!=-1) {
		 System.out.print((char)i);
		 
	 }
	 
 } catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	
	e.printStackTrace();
}
   
  
	}
		
	}

	
	
	
	


