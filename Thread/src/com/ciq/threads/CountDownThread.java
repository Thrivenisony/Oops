package com.ciq.threads;

public class CountDownThread implements Runnable {
	
	private CountDown countdown;


	

	public CountDownThread(CountDown countdown) {
		
	this.countdown = countdown;
	}


	@Override
	public void run() {
		countdown.docountdown();
		
	}
	

}
