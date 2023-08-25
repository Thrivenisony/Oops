package com.ciq.construtor;

public class bike extends vehicle{
@Override
public void start() {
 System.out.println("bike is started");
}
@Override
	public void Engine() {
		System.out.println("bike engine");
	}
@Override
	public void breaks() {
		System.out.println("bike breaks");
	}
@Override
	public void stop() {
		System.out.println("bike is stop");
	}
public static void main(String[] args) {
	bike bike=new bike();
	bike.start();
	bike.Engine();
	bike.breaks();
	bike.stop();
}


}
