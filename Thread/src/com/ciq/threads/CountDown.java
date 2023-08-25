package com.ciq.threads;

public class CountDown {
	private int i;
	public void docountdown() {
		synchronized (this) {
			
		for(i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

}
}