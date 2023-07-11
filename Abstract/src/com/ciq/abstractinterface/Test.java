package com.ciq.abstractinterface;

public class Test {
	public static void main(String[] args) {
		Network n=new Airtel();
		n.call();
		n.data();
		n.sms();
	}

}
