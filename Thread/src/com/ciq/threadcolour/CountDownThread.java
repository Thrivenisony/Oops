package com.ciq.threadcolour;
public class CountDownThread implements Runnable {

	private CountDown countDown;

	public CountDownThread(CountDown countDown) {
		this.countDown = countDown;
	}

	@Override
	public void run() {
		countDown.doCountDown();

	}

}