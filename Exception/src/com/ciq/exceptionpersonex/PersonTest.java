package com.ciq.exceptionpersonex;

public class PersonTest {
//	public static Person[] getAllPersons() {
//		 Person p1=new Person(1,"ram");
//			Person p2=new Person(2,"sitha");
//			Person p3=new Person(3,"laxman");
//			Person p4=new Person(4,"krishna");
//			Person p5=new Person(5,"ravana");
//			Person[] ps= {p1,p2,p3,p4,p5};
//			for (Person person : ps) {
//				System.out.println(person);
//			}
//			return ps;  
//	}
	public static void getId(int id) throws PersonNotFoundException {
		Person p6=new Person();
		System.out.println(p6);
		Person p1=new Person(1,"ram");
		Person p2=new Person(2,"sitha");
		Person p3=new Person(3,"laxman");
		Person p4=new Person(4,"krishna");
		Person p5=new Person(5,"ravana");
		Person[] ps= {p1,p2,p3,p4,p5};
		Person result=null;
		for (Person person : ps) {
			if(id==person.getId()) {
				result=person;
				System.out.println(result);
			}
			}
		if(result==null) {
			System.out.println("please enter a valid id number");
			//throw new NullPointerException("person not found exception");
			throw new PersonNotFoundException("person not found exception");
		}
	  
	}
public static void main(String[] args) {
  
//   if(getAllPersons()!=null) {
//	   getAllPersons();
//	  }else {
//		  System.out.println("no persons");
//	  }
//try {
	try {
		getId(6);
	} catch (PersonNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//}catch(PersonNotFoundException e) {
		//System.out.println(e.getMessage());
	//}
		
	}
	
	
}

