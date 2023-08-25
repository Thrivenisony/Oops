package com.ciq.inputandoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String[] args) {
  try(FileWriter fw=new FileWriter("D:\\hello.txt");) {
	fw.write("welcome to file write msg");
	System.out.println("success");
} catch (IOException e) {
	
	System.out.println(e.getMessage());
}
	
}
}
