package com.ciq.construtor;

public class Employee {
	// instance variable
	int id;
	String name;
	static String EMP_ORGANIZATION = "ciq";

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(int id, String ename) {
		System.out.println("parameterized constructor");
		this.id = id;
		name = ename;
	}

	public void displayEmployeeDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(EMP_ORGANIZATION);
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	// main method
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 1;
		employee.name = "dinesh";
//		employee.empOrganization="ciq";
//		employee.displayEmployeeDetails();
//		System.out.println(employee.id);
//		System.out.println(employee.name);
		System.out.println(employee.getName());
		System.out.println(employee.getId());

		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "anil";
//		e2.empOrganization="ciq";
//		System.out.println(e2.id);
//		System.out.println(e2.name);
		e2.displayEmployeeDetails();

		Employee e3 = new Employee(3, "ram");
		e3.displayEmployeeDetails();

		// local variables
//		int id = 1;
//		String name = "anil";

//		System.out.println(id);
//		System.out.println(name);

//		int id2=2;
//		String name2="dinesh";
//		System.out.println(id2);
//		System.out.println(name2);
	}

}
