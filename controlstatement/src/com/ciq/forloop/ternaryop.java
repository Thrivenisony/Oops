package com.ciq.forloop;

public class ternaryop {
	public static void main(String[] args) {
		int a = 200;
		int b = 300;
		System.out.println(a > b); // 10>20 --> false
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a >= b);
//		System.out.println(a > b);
//		System.out.println(a > b);
//		== equal to
//		!! not equal to
		System.out.println(a == b);
		System.out.println(a != b);

		// ternary operators// a value
// condition? value1: value2
		int result = a > b ? a : b;
		System.out.println(result);
		
		String output=a>b?"a is big":"b is big";
		System.out.println(output);
	}

}

