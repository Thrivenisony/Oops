package com.ciq.strings;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String s1="hello world how are you";
		String s3="welcome to java";
		String s2=new String("hello").intern();
		String s9=new String("hello").intern();
		System.out.println(s2==s9);
		String s4="Adhithya";
		String s8=new String("Adhithya");
		
		
		
		System.out.println("***************");
		String s5="185";
		int i=567;
		String s="abc";
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		String si=String.valueOf(i);
		System.out.println(si);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(Integer.valueOf(s5));
		
		System.out.println(s1.contains("e "));
		System.out.println(s1.startsWith("el"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toCharArray());
		
		System.out.println("***************");
		
		System.out.println(s2.indexOf("e"));
		System.out.println(s3.substring(11,15));
		System.out.println(Arrays.toString(s1.split(" ")));
		System.out.println(s1.charAt(5));
		System.out.println(s4.replace("Adhithya", "Thriveni"));
		System.out.println(s1.replaceAll("hello","welcome"));
	}

}
