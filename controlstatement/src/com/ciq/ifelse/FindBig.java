package com.ciq.ifelse;

public class FindBig {

public static void main(String[] args) {
	
	int a=5;
	int b=30;
	int c=60;
	
	if (a>b && a>c) {
		System.out.println(a);
	}
	else if (b>a&&b>c) {
		System.out.println(b);
		
	}else {
		System.out.println(c);
	}
	
	//terinary
//	int p=a>b?a:b;
//	
//	
//	System.out.println(p);
	
//	terinary with three variable
	
	int o=a>b&&a>c?a:b>a&&b>c?b:c;
	System.out.println(o);
	
}
	
}
