package com.ciq.cloneable;

public class Address implements Cloneable{
private String city;
private String state;
private int zipcode;
public Address() {
	
}
public Address(String city, String state, int zipcode) {
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
