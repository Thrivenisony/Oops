package com.ciq.interfacedemo;

public class  Airtel implements Network {

	@Override
	public void callrates() {
		System.out.println("airtel callrates;"+1.5);
	}

	@Override
	public void smsrates() {
		System.out.println("airtel smsrates;"+"2.88p/sec");		
	}

	@Override
	public void datarates() {
		System.out.println("airtel datarates"+2.5);
	}

}
