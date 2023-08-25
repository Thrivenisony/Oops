
package com.ciq.checkedexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckedExceptionDemo2 {
	public static void main(String[] args)  {
		
	
   String message="What is a Checked Exception in Java ? Checked exceptions are the ones that are checked during compilation time. If a code within a method throws a checked exception, then it should either be handled by a method or specify it using the throws keyword.";
 
   File file=new File(" message.txt");
   FileOutputStream fos=null;
   
try {
	fos = new FileOutputStream(file);
	 byte[] bytes=message.getBytes();
	  
	   fos.write(bytes);
	   System.out.println("success");

} catch (FileNotFoundException e) {
	
	e.printStackTrace();
} catch (IOException e) {
	
	e.printStackTrace();
}
 finally {
	 try {
		 System.out.println("for clean up process");
		 if(fos!=null)
		fos.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
 }

}

}