package com.ciq.cloneable;

public class Customer implements Cloneable{
	
	private int id;
	private String name;
	private String Address;
	private Address add;
	private Order order;
	
	public Customer(int id, String name, String address,Address add,Order order) {
		
		this.id = id;
		this.name = name;
		this.Address = address;
		this.add=add;
		this.order=order;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	
public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	public Order getorder() {
		return order;
	}
	public void setorder(Order order) {
		this.order=order;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer clone1=(Customer) super.clone();
		clone1.setAdd( (Address) getAdd().clone());
		clone1.setorder((Order) getorder().clone());
		return clone1;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Address=" + Address + ", add=" + add + ", Order=" + order + "]";
	}

	
//	public static void main(String[] args) throws CloneNotSupportedException {
//		Customer originaldata=new Customer(1, "Thriveni", "Nalgonda");
//		System.out.println(originaldata);
//		Customer cloned=  (Customer) originaldata.clone();
//		System.out.println(cloned);
//		System.out.println("--------After updating original data------------");
//		originaldata.setName("thaduri");
//		originaldata.setAddress("warangal");
//		System.out.println(originaldata);
//		System.out.println(cloned);
//		System.out.println("--------After updating original data------------");
//		originaldata.setName("sony");
//		originaldata.setAddress("hyd");
//		System.out.println(originaldata);
//System.out.println(cloned);		
//	}
	
}
