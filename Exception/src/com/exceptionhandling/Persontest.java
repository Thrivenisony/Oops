package com.exceptionhandling;

public class Persontest {
	
	public static Person[] getAllPersons() { //method
		Person p1 = new Person(1, "vinay");
		Person p2 = new Person(2, "ram");
		Person p3 = new Person(4, "dharma");
		Person p4 = new Person(3, "laxmi");

		Person[] persons = { p1, p2, p3, p4 };
		for (Person person : persons) {
			System.out.println(person);
		}
		return persons;
	}
	public static void getPersonById(int id) {
		Person p5 = new Person();
		System.out.println(p5);
		Person p1 = new Person(1, "vinay");
		Person p2 = new Person(2, "ram");
		Person p3 = new Person(4, "dharma");
		Person p4 = new Person(3, "laxmi");
		Person[] persons = { p1, p2, p3, p4 };
		Person result = null;
		for (Person person : persons) {
			if (id == person.getId()) {
				result = person;
				System.out.println(result);
			}
		}
		if (result == null) {
			System.out.println("enter valid id");
			throw new NullPointerException("person not found exception");
		}
	}
        public static void main(String[] args) {
	if (getAllPersons() != null) {
		getAllPersons();
	} else {
		System.out.println(" no persons");
	//getPersonById(1);
	}
	
}
}
