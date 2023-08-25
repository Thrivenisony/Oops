package com.ciq.threaddeadlocks;

public class Test {
	public static void main(String[] args) {
		Message msg=new Message();
		Write write=new Write(msg);
		Thread t1=new Thread(write);
		t1.start();
		
		
		Read read=new Read(msg);
		Thread t2=new Thread(read);
		t2.start();
	}

}
