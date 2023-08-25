package com.ciq.threadcolour;
public class CountDownTest {
	public static void main(String[] args) {
		CountDown countDown=new CountDown();
		CountDownThread countDownThread=new CountDownThread(countDown);
		Thread t1=new Thread(countDownThread);
		t1.setName("A");
		t1.start();
		
		
		Thread t2=new Thread(countDownThread);
		t2.setName("B");
		t2.start();
	}

}