package com.ciq.inputandoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintwriterDemo {
	public static void main(String[] args) throws IOException  {
		PrintWriter out=new PrintWriter(new FileWriter("sahithi.txt"));
		
		out.println(true);
		out.println(20.00);
		out.println("hello java");
		out.println(12);
		//out.flush();
		out.close();
	}

}
