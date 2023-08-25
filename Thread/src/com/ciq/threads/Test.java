package com.ciq.threads;

public class Test {
	public static void main(String[] args) {
		CountDown cd=new CountDown();
		CountDownThread cdt=new CountDownThread(cd);
		Thread t1=new Thread(cdt);
		t1.setName("Thread 1");
		t1.start();
		
		Thread t2=new Thread(cdt);
		t2.setName("Thread 2");
		t2.start();
		
		
		
		
	}

}
