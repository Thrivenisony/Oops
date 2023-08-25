package com.ciq.Methods;

public class rectangle {
	public void area() {
		double width=25.00;
		double length=30.00;
		double areaOfrectangle=(width*length);
		System.out.println(Math.round(areaOfrectangle));
		
	}
public static void main(String[] args) {
	rectangle rectangle=new rectangle();
	rectangle.area();
	
}
}
