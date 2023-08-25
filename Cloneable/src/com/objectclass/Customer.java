package com.objectclass;

public class Customer implements Cloneable {
	private int id;
	private String name;
	private Address address;
	private Order order;
	

	public Customer() {

	}

	public Customer(int id, String name, Address address, Order order) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.order=order;
	}

//	public Customer(int id, String name, String address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}

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

//	public String getAddress() {
//		return address;
//	}

//	public void setAddress(String address) {
//		this.address = address;
//	}

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", order="+ order+"]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer cloned=(Customer) super.clone();
		cloned.setAddress((Address) getAddress().clone());
        cloned.setOrder((Order)getOrder().clone());
		return cloned ;
	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		Customer cloned=(Customer) super.clone();
//		cloned.setAddress((Address)getAddress().clone());
//		return cloned;
//	}
//	public static void main(String[] args) throws CloneNotSupportedException {
//		Customer originalobject=new Customer(1,"sai","hyd");
//		System.out.println(originalobject);
//		Customer clonedobject=(Customer) originalobject.clone();
//		System.out.println(clonedobject);
//		System.out.println("......after updating original data.......");
//		originalobject.setName("ani kumar");
//		//originalobject.setAddress("wrgl");
//		System.out.println(originalobject);
//		System.out.println(clonedobject);
//	}

	

}
