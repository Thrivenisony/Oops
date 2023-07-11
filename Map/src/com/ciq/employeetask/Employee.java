package com.ciq.employeetask;

public class Employee {
private int eid;
private String ename;
private double esalaray;
private Department department;

public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String ename, double salaray) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalaray = salaray;
}
public Employee(int eid, String ename, double salaray, Department department) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalaray = salaray;
	this.department = department;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public double getSalaray() {
	return esalaray;
}
public void setSalaray(double salaray) {
	this.esalaray = salaray;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salaray=" + esalaray + ", department=" + department + "]";
}


}
