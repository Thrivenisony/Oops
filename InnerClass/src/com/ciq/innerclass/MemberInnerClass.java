package com.ciq.innerclass;

public class MemberInnerClass {

	
	int employeeId=10;
	
	 void outerMethod3() {
		  System.out.println("outer Method3");
	  }
	  
	class Inner implements Animal{
		 
	void hhr()
		 {
			  System.out.println("mm");
		 }
		  int employeeId2=105;
		  
		 
		  
		  
		  void innerMethod() {
			  outerMethod3();
			  System.out.println(employeeId2);
			  System.out.println("innerMethod");
			  System.out.println(employeeId);
		  }




		@Override
		public void eat() {
			System.out.println("eat");
			
		}




		@Override
		public void drink() {
			System.out.println("drink");
			
		}





        
		  
	  }
	
	class outr{
		
		
		void adhi() {
			outerMethod3();
			System.out.println(employeeId);
			System.out.println("adhithya");
		}
	}
	  
	void outerMethod2() {
		  System.out.println("outer Method2");
	  }
}
