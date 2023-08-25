package com.ciq.construtors;

public class Employeetest {
	public static void main(String[] args) {
		Employee emp1=new Employee(1, "adhi", 3000);
		//emp.displayemp();
		
		Employee emp2=new Employee();
		emp2.id=2;
		emp2.name="naresh";
		emp2.salary=3000;
		//emp2.displayemp();
		
		Employee emp3=new Employee(3, "Thriveni", 3000);
		//emp3.displayemp();
		Employee emp4=new Employee(4, "Deepika", 5000);
		
		Employee[] emp5= {emp1,emp2,emp3,emp4};
		for(int i=0;i<emp5.length;i++) {
			emp5[i].displayemp();
		}
		
//		Employee [] emp4= {emp,emp2,emp3};
//		for(int i=0;i<emp4.length;i++ ) {
//			emp4[i].displayemp();
//		}
//		for(Employee emps:emp4) {
//			emps.displayemp();
//		}
	}

}
