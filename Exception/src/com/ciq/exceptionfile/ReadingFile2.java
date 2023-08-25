package com.ciq.exceptionfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile2 {
	
	static final String PATH="D:\\createiq\\Exception ";
	public static void main(String[] args) {
		File file=new File(PATH+"message.txt");
		FileInputStream fis=null;
		try {
			fis= new FileInputStream(file);
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			try {
				System.out.println("clean the activites");
				if(fis!=null) {
					fis.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
