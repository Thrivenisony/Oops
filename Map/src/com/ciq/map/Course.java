package com.ciq.map;

public class Course {
	private int id;
	private String courseName;
	private int coursePeriod;

	public Course() {
		
	}

	public Course(int id, String courseName, int coursePeriod) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.coursePeriod = coursePeriod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCoursePeriod() {
		return coursePeriod;
	}

	public void setCoursePeriod(int coursePeriod) {
		this.coursePeriod = coursePeriod;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", coursePeriod=" + coursePeriod + "]";
	}

	
}
