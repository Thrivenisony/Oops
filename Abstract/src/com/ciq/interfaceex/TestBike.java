package com.ciq.interfaceex;

public class TestBike {
public static void main(String[] args) {
	Bike b=new pulsar();
	Bike b1=new RoyalEnfield();
	Bike b2=new Herohonda();
	b.Start();
	b.Colour();
	b.Engine();
	b.Stop();
	b1.Start();
	b1.Colour();
	b1.Engine();
	b1.Stop();
	b2.Start();
	b2.Colour();
	b2.Engine();
	b2.Stop();
	
}
}
