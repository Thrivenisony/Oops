package com.ciq.objectccls;

public class Product {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
 
public Product(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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
		return true;
	}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

      public static void main(String[] args) {
		Product pro1=new Product(1, "Thriveni");		
	     Product pro2=pro1;
		Product pro3=new Product(1, "Thriveni");	
        System.out.println(pro1.getClass());
	   System.out.println(pro1.toString());
	   System.out.println(pro1.hashCode());
		System.out.println(pro2.hashCode());
	System.out.println(pro3.hashCode());
	System.out.println(pro1.equals(pro2));
	System.out.println(pro1.equals(pro3));
	}
}
