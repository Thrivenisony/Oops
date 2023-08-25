package com.ciq.construtor;

public class car extends vehicle {
	@Override
	public void start() {
		System.out.println("car is started");
	}
	@Override
	public void Engine() {
		System.out.println("car engine");
	}
	@Override
	public void breaks() {
	System.out.println("car breaks");
	}
	@Override
	public void stop() {
		System.out.println("car stop");
	}
	public static void main(String[] args) {
		car car=new car();
		car.start();
		car.Engine();
		car.breaks();
		car.stop();
	}
}

