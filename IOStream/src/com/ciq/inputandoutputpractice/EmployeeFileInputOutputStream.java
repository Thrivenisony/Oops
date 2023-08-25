package com.ciq.inputandoutputpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmployeeFileInputOutputStream {
	private static final String PATH="D:\\";
	public static void main(String[] args) {
		Employee emp=new Employee(1, "naresh", 60000);
	File file=new File(PATH+"nareshFile.txt");
	try(FileOutputStream fos=new FileOutputStream(file);){
		byte[] bytes=emp.toString().getBytes();
		fos.write(bytes);
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	try(FileInputStream fis=new FileInputStream(file);){
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}
}
	