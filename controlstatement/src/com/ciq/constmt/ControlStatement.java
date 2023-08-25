package com.ciq.constmt;

public class ControlStatement {
	public static void main(String[] args) {
		int age=20;
		if(age>=18) {
			System.out.println("eligible for voting"+age);
			
		}
		else {
		System.out.println("not eligible for voting");
	}
		System.out.println("if else");
	//even numbers
		int a=25;
		if(a%2==0) {
			System.out.println("even");
			
		}
		else {
			System.out.println("odd");
		}
		
		//if else same as ternary op
		String num=(a%2==0)?"even":"odd";
		
		System.out.println("ternary op:"+num);
		
	}
}
