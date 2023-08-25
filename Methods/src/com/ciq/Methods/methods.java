package com.ciq.Methods;
// functions are used to @code reusable
//create once re use many time
public class methods {
public void msg() {
	System.out.println("welcome to java program");
	
}
public static void main(String[] args) {
	methods methodcalling=new methods();
	methodcalling.msg();
	methodcalling.msg();
	methodcalling.msg();
	methodcalling.msg();
	
}
}

