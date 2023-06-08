package com.ciq.Pojo;

public class StudentSubject {
	
	private int id;
	private String sanme;
	private double marks;
	
	public StudentSubject() {
	
	}
	public StudentSubject(int id, String sanme, double marks) {
		super();
		this.id = id;
		this.sanme = sanme;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSanme() {
		return sanme;
	}
	public void setSanme(String sanme) {
		this.sanme = sanme;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentSubject [id=" + id + ", sanme=" + sanme + ", marks=" + marks + "]";
	}
	

}
