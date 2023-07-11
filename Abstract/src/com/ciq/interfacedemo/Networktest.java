package com.ciq.interfacedemo;

public class Networktest {
public static void main(String[] args) {
	

	Network ne=new Airtel();
	Network ne1=new Jio();
	
	ne.callrates();
	ne.datarates();
	ne.smsrates();
	ne1.callrates();
	ne1.datarates();
	ne1.smsrates();
}
}
