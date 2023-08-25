package com.ciq.scanner;

import java.util.Scanner;


public class Rectangle {
	
public double area() {
	Scanner scan =new Scanner(System.in);
	System.out.println("please enter a area of length");
double length=scan.nextDouble();
Scanner scan2 =new Scanner(System.in);
System.out.println("please enter a area of width");
double width=scan2.nextDouble();
   double area=length*width;
	System.out.println("area of rectangle"+area);
	return area;
}
public static void main(String[] args) {
	Rectangle rectangle=new Rectangle();
	rectangle.area();
//	rectangle.area(50, 60);
//	rectangle.area(80, 40);
//	rectangle.area(50, 20);
	Scanner scan =new Scanner(System.in);
//	System.out.println("please enter a value");
//	int a=scan.nextInt();
//	System.out.println(a);
//	
//	
	
	
	
	


 
 

	
}

}
