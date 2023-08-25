package com.objectclass;

public class CustomerTest  {
	
		public static void main(String[] args) throws CloneNotSupportedException {
			Address address=new Address("hyd", "ts", "23434");
			Order order=new Order("sahithi", "processing");
		Customer originalobject=new Customer(1, "anil", address,order);
			System.out.println(originalobject);
			Customer clonedobject=(Customer) originalobject.clone();
			System.out.println(clonedobject);
			System.out.println("......after updating original data.......");
			originalobject.setName("ani kumar");
			originalobject.getAddress().setCity("pune");
			originalobject.getAddress().setState("mh");
			originalobject.getAddress().setZipcode("12345");
			originalobject.getOrder().setdeliverystatus("your order reached your location");
			//originalobject.setAddress("wrgl");
			System.out.println(originalobject);
			System.out.println(clonedobject);
		}
	}