package com.ciq.map;

import java.util.Date;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private Date dob;
    private List<Course> course;
    
    public Student() {
		
	}

	public Student(int id, String name, Date dob, List<Course> course) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.course = course;
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

	public Date getDate() {
		return dob;
	}

	public void setDate(Date dob) {
		this.dob = dob;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public String getDateF(Date d) {
		return StudentDobFormatter.getDateMMDDYYYY(d);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", date=" + getDateF(dob) + ", course=" + course + "]";
	}

}
