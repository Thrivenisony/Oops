package com.ciq.hashmap;

public class Department {
private int did;
private String dname;
private String dlocation;

public Department() {
	// TODO Auto-generated constructor stub
}

public Department(int did, String dname, String dlocation) {
	super();
	this.did = did;
	this.dname = dname;
	this.dlocation = dlocation;
}

public int getDid() {
	return did;
}

public void setDid(int did) {
	this.did = did;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getDlocation() {
	return dlocation;
}

public void setDlocation(String dlocation) {
	this.dlocation = dlocation;
}

@Override
public String toString() {
	return "Department [did=" + did + ", dname=" + dname + ", dlocation=" + dlocation + "]";
}


}
