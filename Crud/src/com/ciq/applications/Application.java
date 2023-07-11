package com.ciq.applications;

import com.ciq.daolayer.Dao;
import com.ciq.daolayer.StudentDao;
import com.ciq.daolayer.Student;

public class Application {
	public static void main(String[] args) {
		Dao dao=new StudentDao();
	
		
		Student s=new Student(6,"usha","usha@gmail.com");
		Student s1=new Student(10,"ushaSri","usha@gmail.com");
		
//		dao.create(s);
//		dao.update(2, s1);
		System.out.println(dao.sortedlist());
		//System.out.println(dao.getAll());
		System.out.println(dao.getAllwithsubs());
	
	}

}
