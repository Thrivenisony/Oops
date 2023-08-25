package com.ciq.tostring;

public class Customer implements Comparable<Customer> {
	private int id;
	private String FirstName;
	private String LastName;
	private String Address;
	private double Salary;
	
public Customer(int id, String FirstName,String LastName,String Address,double Salary) {
	this.id=id;
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.Address=Address;
	this.Salary=Salary;
	}
     public int getid() {
	    return id;
}
    public void setid(int id) {
	this.id=id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String FirstName) {
	this.FirstName=FirstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String LastName) {
	this.LastName=LastName;
}
public  String getAddress() {
	return Address;
}
public void setAddress(String Address) {
	this.Address=Address;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double Salary) {
	this.Salary=Salary;
}
public String toString() {
	//return "id:"+" "+id+"firstname:"+" "+FirstName+"lastname:"+" "+LastName+"address:"+" "+Address+"salary:"+" "+Salary;
return "id:"+" "+id+"Firstname:"+" "+FirstName+"lastname:"+" "+LastName+"address:"+" "+Address+"salary:"+" "+Salary;
}
//// comparation b/w other class to this class des order
//@Override
//public int compareTo(Customer other) {
//	
//	return other.id-this.id;
//}

//comparation b/w this class to other class asc order
@Override
public int compareTo(Customer other) {
	
	//return this.FirstName.compareTo(other.FirstName);
	return this.LastName.compareTo(other.LastName);
}


}




