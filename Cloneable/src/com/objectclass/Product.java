package com.objectclass;

public class Product {
private int id;
private String name;
private double price;
public Product(int id,String name,double price) {
	this.id=id;
	this.name=name;
	this.price=price;
	
}

    @Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
//    @Override
//    	public int hashCode() {
//    	
//    		return id;
//    	}
    
    
    
//creating our own equals method;

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Product other = (Product) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	return true;
}

	public static void main(String[] args) {
		Product pro1=new Product(1, "earphones", 200.00);
		Product pro2=pro1;
		Product pro3=new Product(1, "earphones", 200.00);
		Product pro4=new Product(1,"earphones",200.00);
		System.out.println(pro1.getClass());
		System.out.println(pro1.hashCode());
		System.out.println(pro2.hashCode());
		System.out.println(pro3.hashCode());
		System.out.println(pro1.toString());
		System.out.println(pro2.toString());
		System.out.println(pro3.toString());
		System.out.println(pro1.equals(pro2));//true
		System.out.println(pro1.equals(pro3));//true
		System.out.println(pro4);
	}
}

