package com.ciq.interfaceex;

public class Herohonda implements Bike{

	@Override
	public void Start() {
		System.out.println("Herohonda bike is started");
	}

	@Override
	public void Colour() {
		System.out.println("Herohonda bike colour is blue");
	}

	@Override
	public void Engine() {
		System.out.println("Herohonda bike engine");
	}

	@Override
	public void Stop() {
		System.out.println("Herohonda bike stop");
	}
	
	

}
