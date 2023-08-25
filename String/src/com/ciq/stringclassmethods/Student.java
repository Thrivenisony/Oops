package com.ciq.stringclassmethods;

public class Student {
private int id;
private String name;
public Student(int id,String name) {
	this.id=id;
	this.name=name;
	}
public int getid() {
	return id;
}
public void setid() {
	this.id=id;
	
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
	
}

public String toString() {
	return "id"+" "+id+"name"+" "+name;
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public static void main(String[] args) {
	Student s1=new Student(1,"adhi");
	Student s2=new Student(1,"adhi");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
}
}
