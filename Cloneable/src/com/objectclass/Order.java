package com.objectclass;

public class Order implements Cloneable{
String name;
String deliverystatus;
//default constructor
public Order() {                                         
	
}
//parametrized constructor
public Order(String name, String deliverystatus) {
	this.name = name;
	this.deliverystatus = deliverystatus;
}
//get and set methods
public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public String getdeliverystatus() {
	return deliverystatus;
	
}
public void setdeliverystatus(String deliverystatus) {
	this.deliverystatus=deliverystatus;
}
//to string
@Override
	public String toString() {
		
		return "order[name="+name+", deliverystatus="+deliverystatus+"]";
	}
//overriden clone() method.
@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
