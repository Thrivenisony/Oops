package com.ciq.DaoLayer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ciq.Pojo.Student;
import com.ciq.Pojo.StudentSubject;

public class StudentDao implements Dao{
	
	static List<Student> list=new ArrayList<>();
	static Set<StudentSubject> subs=new HashSet<>();
	
	
	static {
		list.add(new Student(4,"Thriveni","thriveni@gmail.com"));
		list.add(new Student(3,"sahithi","sahithi@gmail.com"));
		list.add(new Student(2,"Latha","latha@gmail.com"));
		list.add(new Student(1,"Priya","priya@gmail.com"));
		
		subs.add(new StudentSubject(12, "maths", 50.2));
		subs.add(new StudentSubject(10, "science", 60.2));
		subs.add(new StudentSubject(15, "english", 40.2));
		subs.add(new StudentSubject(18, "social", 30.2));
	}


	@Override
	public List<Student> getAll() {
		
		return list;
	}


	@Override
	public void create(Student s) {
		list.add(s);
		
	}


	@Override
	public void update(int a, Student s1) {
		
		list.set(a, s1);
	}


	@Override
	public List<Student> sortedlist() {
	 Comparator<Student> com=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
		
			return o1.getId()-o2.getId() ;
		}
	};
	 Collections.sort(list,com);
		return list;
	}


	@Override
	public List<Student> getAllwithsubs() {
		List<Student> ll=new ArrayList<>();
		for (Student student : list) {
			student.setSubs(subs);
			ll.add(student);
		}
		return ll;
	}




	
}
