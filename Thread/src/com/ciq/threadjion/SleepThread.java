package com.ciq.threadjion;

public class SleepThread extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			
			try {
				System.out.println("run:"+ Thread.currentThread().getName());
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
				}
		}
	
	 public static void main(String[] args) {
		 SleepThread st=new SleepThread();
		 Thread th=new Thread(st);
		 th.setName("thriveni");
		 System.out.println("main:"+ Thread.currentThread().getName());
		 th.start();

	}

}
