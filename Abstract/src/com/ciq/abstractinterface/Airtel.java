package com.ciq.abstractinterface;

public class Airtel implements Network{

	@Override
	public void data() {
		System.out.println("Airtel data");
		
	}

	@Override
	public void sms() {
		System.out.println("Airtel sms");
		
	}

	@Override
	public void call() {
System.out.println("Airtel call");
		
	}
	

}
