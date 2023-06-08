package com.ciq.DaoLayer;

import java.util.List;

import com.ciq.Pojo.Student;

public interface Dao {
	
	public List<Student> getAll();
	
	public void create(Student s);
	
	public void update(int a,Student s1);
	
	public List<Student> sortedlist();
	
	public List<Student> getAllwithsubs();
	
	
	
	

}
