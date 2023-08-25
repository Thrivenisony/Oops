package com.ciq.exception;

import java.util.ArrayList;
import java.util.List;

public class Exception {
public static void main(String[] args) {
	System.out.println("Statement1");
	System.out.println("Statement2");
	System.out.println("Statement3");
try {      //null pointer exception
Exception s1 =null ;
	System.out.println(s1.getClass());
}catch(NullPointerException e) {
	System.out.println("please provide a construtor for an instance");

} 
try {   //arthametic Exception
System.out.println(10/0);
}catch(ArithmeticException e) {
	System.out.println("please valid number");
}
try {  //number Format exceotion
String s2="ert";
System.out.println(Integer.parseInt(s2));
}catch(NumberFormatException d) {
	System.out.println("a string can not convert into a number");
}
try {//ArrayIndexOutOfBoundsException
int a[]= {10,89};
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
}catch(ArrayIndexOutOfBoundsException a) {
	System.out.println("please provide an index below 2");
}
try {//IndexOutOfBoundsException 
	
	List<Integer>l=new ArrayList<>();
	l.add(10);
	l.add(20);
	System.out.println(l.get(2));
}catch(IndexOutOfBoundsException e) {
	System.out.println("please access element below 2");
}
	System.out.println("Statement4");
	System.out.println("Statement5");
	System.out.println("Statement6");
}
}
