package com.ciq.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id;
private String name;
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(int id,String name) {
	this.setId(id);
	this.setName(name);
	
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
public static void main(String[] args) {
	
	try {
		Student st=new Student(1,"naresh");
		FileOutputStream fos= new FileOutputStream("nari.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(st);
		oos.flush();
		oos.close();
		System.out.println("success");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
	
}

}
