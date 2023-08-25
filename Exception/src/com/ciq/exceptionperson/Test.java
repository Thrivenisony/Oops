package com.ciq.exceptionperson;

public class Test {
	
public static Person[] TotalPersons() {
	
	Person p1=new Person(1, "Thriveni");
	Person p2=new Person(2, "Sony");
	Person p3=new Person(3, "Thaduri");
	Person p4=new Person(4, "thirunagiri");
	Person[] ps= {p1,p2,p3,p4};
	//Person: class name
	//pe: referance name
	//ps:Array name
	for(Person pe:ps) {
		System.out.println(pe);
		
	}
	return ps;
	
}
public static void getPersonId(int id) {
	Person p5=new Person();
	System.out.println(p5);
	Person p1=new Person(1, "Thriveni");
	Person p2=new Person(2, "Sony");
	Person p3=new Person(3, "Thaduri");
	Person p4=new Person(4, "thirunagiri");
	Person[] ps= {p1,p2,p3,p4};
	Person result=null;
	for(Person pe:ps) {
		if(id==pe.getid()) {
			result=pe;
		System.out.println(result);
		}
	}
		if(result==null) {
			//System.out.println("please enter a valid id:"+id);
		throw new NullPointerException("please enter a valid id");
			
		}
		
		
}
public static void main(String[] args) {
	Test ts=new Test();
	ts.TotalPersons();
//	if (TotalPersons() != null) {
//		TotalPersons();
//	} else {
//		System.out.println(" no persons");
//	}
	
	getPersonId(3);
	
	
}
}