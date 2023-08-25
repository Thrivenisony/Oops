package com.ciq.cloneable;

public class Order implements Cloneable{
	private int id;
	private String states;
	public Order(int id,String states) {
		this.id=id;
		this.states=states;
		
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getstates() {
		return states;
	}
public void setstates(String states) {
	this.states=states;
	
}
@Override
public String toString() {
	return "Order [id=" + id + ", states=" + states + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
}

