package aggregation;

import java.util.Arrays;

public class person {
	private int id;
	private String name;
	private  double salary;
	private Address[] address;//Aggregation is a entity  means class name 
	public person(int id,String name,double salary,Address[] address) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
public int getid() {
	return id;
	}
public void setid(int id) {
	this.id=id;
}
public Address[] getAddress() {
	return address;
}
public void setAddress(Address[] address) {
	this.address = address;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public double getsalary() {
	return salary;
}
public void setsalary(double salary) {
	this.salary=salary;
}
@Override
public String toString() {
	return "person [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + Arrays.toString(address) + "]";
}















}
