package com.ciq.stringclassmethods;

public class StringDemo {
	//private static int count;
	public static void main(String[] args) {

		String s1="helloworld";//literal creation
		String s2=new String("helloworld");//new keyword
		String s3="tHRIVENI";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	  System.out.println(s2.concat(s3));
		int a=10;
		int b=10;
		if(a==b) {
			System.out.println("both values are same");
		}
		else {
			System.out.println("both values are not same");
		}
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.contains("helloworld"));
		System.out.println("before removing the white space");
        System.out.println(s1);
	    System.out.println("after removing the white space");
		System.out.println(s1.trim());
	char[] chars=s1.toCharArray();
	for(char c:chars) {
		System.out.println(c);
	}
	byte[] bytes=s1.getBytes();
	for(byte g:bytes) {
		System.out.println(g);
		
	}
	char ch=s1.charAt(5);
	System.out.println(ch);
	char[] th= {'a','b','c','d','e','f','g','h'};
	System.out.println(th);
	System.out.println(s1.length());
	s2=s1.intern();
	System.out.println(s1==s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	String m1="Ea";
	String m2="FB"; 
	System.out.println(m1.hashCode());
	System.out.println(m2.hashCode());
	
	}
	
}
	
