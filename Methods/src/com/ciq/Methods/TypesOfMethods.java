package com.ciq.Methods;

public class TypesOfMethods{
	//local variable
	//a variable is declared inside a method and inside a class
	// we have 4 types of methods
	//1.without return type and without parameter
	// in this case data is fixed & content is fixed & there is no change in the results
    public void printName() {
	String name="create iq";
	double money=20000.00;
	System.out.println(name);
	System.out.println(money);
}


//2.with return type and without parameter
// with return type is nothing but using data types 
public double amount() {
	double cash=10000.00;
	return cash;
}

//3.with return type and with parameters
public String fullName(String firstName,String LastName) {
	return firstName+" "+LastName;
}

//4. without return type and with parameters
//without return is nothing but void
public void area(double length,double width) {
	double areaOfrectangle=(length*width);
	System.out.println(areaOfrectangle);
	
}



 public static void main(String[] args) {
		TypesOfMethods print=new TypesOfMethods();
		print.printName();
	    System.out.println(print.amount());
	    String fullName=print.fullName("thriveni","thirunagiri");
	    System.out.println(fullName);
	    System.out.println(print.fullName("naresh","thirunagiri"));
	    System.out.println(print.fullName("adithya","thirunagiri"));
      
       print.area(50, 20);
       print.area(15, 20);
       print.area(13, 15);
 }
 



}

