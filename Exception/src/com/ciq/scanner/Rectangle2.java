package com.ciq.scanner;

import java.io.IOException;
import java.util.Scanner;




public class Rectangle2 {
	//private Object area;


//	public double area() {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("please enter a length value");
//		double length=scan.nextDouble();
//		System.out.println("please enter a width value");
//		double width=scan.nextDouble();
//		double  area=length*width;
//		System.out.println("area of rectangle"+area);
//		
//		return area;
//	}
	public double areaof(double length,double width) throws Exception {
		if(length==0.0 || width==0.0) {
			throw new Exception("");
			
		
		}
	
		double area=length*width;
		System.out.println("area of rectangle"+area);
		return area;
		
		} 
		
		
	
	

	public static void main(String[] args)  {
		Rectangle2 rec =new Rectangle2();
		try {
			rec.areaof(10, 20);
		} catch (Exception e) {


System.out.println(e.getMessage());
		}


		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("please enter a message");
//		String msg = scan.next();
////		System.out.println(msg);
//		System.out.println("please enter a charecter msg");
//		char ch= scan.next().charAt(0);
//		System.out.println(ch);
//		
		
	}

}
