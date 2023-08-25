package com.ciq.exceptionfile;

import java.io.File;

public class FileDemo {
	static final String path="D:\\createiq\\Aggregation\\src\\aggregation";
public static void main(String[] args) {
	
	File file=new File(path);
	String[] ListOfFiles=file.list();
	for (String filename : ListOfFiles) {
		System.out.println(filename);
		
	}
}
}
