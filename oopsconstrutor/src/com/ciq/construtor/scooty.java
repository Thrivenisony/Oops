package com.ciq.construtor;

public class scooty extends vehicle{
	@Override
	public void start() {
		System.out.println("scooty is started");
	}
	@Override
	public void Engine() {
		System.out.println("scooty engine");
	}
	@Override
	public void breaks() {
		System.out.println("scooty breaks");
	}
	@Override
	public void stop() {
		System.out.println("scooty stop");
	}
	public static void main(String[] args) {
		scooty scooty=new scooty();
		scooty.start();
		scooty.Engine();
		scooty.breaks();
		scooty.stop();
		
	}
	

}
