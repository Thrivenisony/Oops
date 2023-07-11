package com.ciq.interfacedemo;

public class Jio implements Network {

	@Override
	public void callrates() {
		System.out.println("jio call rates;"+2.6);
		
	}

	@Override
	public void smsrates() {
		System.out.println("jio sms rates;"+2.6);
		
	}

	@Override
	public void datarates() {
		System.out.println("jio data rates;"+2.6);

		
	}
	

}
