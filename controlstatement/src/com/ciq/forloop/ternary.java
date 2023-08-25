package com.ciq.forloop;

public class ternary {
public static void main(String[] args) {
//	int a=60;
//	int b=50;
//	int c=50;
//	int d=a>b&&a>c?a:b>a&&b>c?b:c;
//	System.out.println(d);
//	int f=a>b?a:b;
//	System.out.println(f);
//
	int z=500;
	int y=400;
	System.out.println(z>y);
	System.out.println(z<y);
	System.out.println(z>=y);
	System.out.println(z<=y);
	System.out.println(z==y);
	System.out.println(z!=y);
	int result=z<y?z:y;
	System.out.println(result);
	String output=z>y? "z is big":"y is big";
	System.out.println(output);
}
}