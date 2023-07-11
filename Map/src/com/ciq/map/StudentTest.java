package com.ciq.map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class StudentTest {
	public static void main(String[] args) throws ParseException {
		Course course1=new Course(101, "Java", 150);
		Course course2=new Course(102, "Python", 60);
		Course course3=new Course(103,"Java Script",45);
		Course course4=new Course(104, "Angular", 50);
		Course course5=new Course(105, "C", 55);
		Course course6=new Course(106, "C++", 65);
		
		List<Course> courseOfPython=new ArrayList<Course>();
		courseOfPython.add(course2);
		courseOfPython.add(course4);
		
		List<Course> courseOfJava=new ArrayList<>();
		courseOfJava.add(course1);
		courseOfJava.add(course3);
		
		List<Course> courseOfC=new ArrayList<>();
		courseOfC.add(course5);
		courseOfC.add(course6);
		
		String date1="10/05/1996";
		String date2="01/01/1995";
		String date3="12/12/1990";
		String date4="01/10/2000";
		String date5="06/05/1997";
		String date6="10/04/1994";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yy");
//		String dob11 = sdf.format(date1);
		Date dob11=sdf.parse(date1);
		Date dob22=sdf.parse(date2);
		Date dob33=sdf.parse(date3);
		Date dob44=sdf.parse(date4);
		Date dob55=sdf.parse(date5);
		Date dob66=sdf.parse(date6);
		
		Student student1=new Student(1, "Adhithya", dob11, courseOfPython);
		Student student2=new Student(2, "naresh", dob22, courseOfPython);
		Student student3=new Student(3, "Thriveni", dob33, courseOfJava);
		Student student4=new Student(4, "Savithri", dob44, courseOfJava);
		Student student5=new Student(5, "Laxmi", dob55, courseOfC);
		Student student6=new Student(6, "Priya", dob66, courseOfC);
		
		Map<Student, LocalDate> studentmap=new HashMap<>();
		LocalDate joiningDate1=LocalDate.of(2023, 05, 10);
		LocalDate joiningDate2=LocalDate.of(2023, 02, 04);
		LocalDate joiningDate3=LocalDate.of(2023, 03, 11);
		
		studentmap.put(student1, joiningDate1);
		studentmap.put(student2, joiningDate1);
		studentmap.put(student3, joiningDate2);
		studentmap.put(student4, joiningDate2);
		studentmap.put(student5, joiningDate3);
		studentmap.put(student6, joiningDate3);
		
		for(Map.Entry<Student, LocalDate> entry: studentmap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
