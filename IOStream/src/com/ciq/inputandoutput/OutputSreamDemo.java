package com.ciq.inputandoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputSreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos= new FileOutputStream("hello.txt");
		String msg="hello am a file output stream";
		fos.write(msg.getBytes());
		System.out.println("success");
		fos.close();
		
	}

}
