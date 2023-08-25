package com.ciq.cloneable;

public class Test {
	public static void main(String[] args)throws CloneNotSupportedException  {
		Address ad1=new Address("gn", "ap", 6789);
		Order od= new Order(1, "kfc");
		Customer originaldata=new Customer(1, "Thriveni", "Nalgonda",ad1,od);
		System.out.println(originaldata);
		Customer clonedobject= (Customer) originaldata.clone();
		System.out.println(clonedobject);
		System.out.println("--------After updating original data------------");
		originaldata.setName("thaduri");
		originaldata.setAddress("warangal");
		System.out.println(originaldata);
		System.out.println(clonedobject);
		System.out.println("--------After updating original data------------");
		originaldata.setName("sony");
		originaldata.setAddress("hyd");
		originaldata.getAdd().setCity("hnk");
		originaldata.getAdd().setState("ts");
		originaldata.getAdd().setZipcode(568462);
		originaldata.getorder().setid(2);
		originaldata.getorder().setstates("delivery");
		System.out.println(originaldata);
     System.out.println(clonedobject);		
	}

	}


