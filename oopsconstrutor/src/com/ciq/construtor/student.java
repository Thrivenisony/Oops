package com.ciq.construtor;

public class student {
	int rollno;
	String name;
	String coursename;

	public student() {

	}

	public student(int x) {
		// this();
		this.rollno = x;

	}

	public student(int x, String y) {

		// this(x);
		this.rollno = x;
		name = y;
		System.out.println("x,y const");

	}

	public student(int x, String y, String z) {
		this(x, y);
		this.rollno = x;
		name = y;
		coursename = z;

	}

	public static void main(String[] args) {
		student student = new student();
//	System.out.println(student.rollno=1);
//	System.out.println(student.name="thriveni");
//	System.out.println(student.coursename="mca");
		student st = new student(10, "ss", "addr");
//	student s1=new student(1, "name");
		System.out.println(st.name + st.rollno + st.coursename);

	}
}
