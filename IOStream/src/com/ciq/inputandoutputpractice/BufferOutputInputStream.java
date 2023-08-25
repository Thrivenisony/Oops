package com.ciq.inputandoutputpractice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputInputStream {
	private static final String PATH="D:\\";
	public static void main(String[] args) {
		Employee emp=new Employee(1, "shekhar", 50000);
		File file=new File(PATH+"shekharfile.txt");
		try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file));){
			byte[] bytes=emp.toString().getBytes();
			bos.write(bytes);
			
					} catch (IOException e) {
						e.printStackTrace();
					}
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));){
			int i=0;
			while((i=bis.read())!=-1) {
				System.out.print((char)i);
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			
		}
	}


