package com.ciq.exceptionfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {
	static final String PATH="D:\\createiq\\Exception\\ ";
	public static void main(String[] args) throws IOException  {
		File file=new File(PATH+"message.txt");
		FileInputStream fis= new FileInputStream(file);
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print(i);
		}
		
	}

}
