package com.ciq.construtor;

public class vehicle {
//	methods
	public void start() {
		System.out.println("vehicle start");
	}
public void Engine() {
	System.out.println("vehicle engine");
}
public void breaks()
{
	System.out.println("vehicle breaks");
}
public void stop() {
	System.out.println("vehicle stop");
}
public static void main(String[] args) {
	vehicle vehicle=new vehicle();
	vehicle.start();
	vehicle.Engine();
	vehicle.breaks();
	vehicle.stop();
	
}
}
