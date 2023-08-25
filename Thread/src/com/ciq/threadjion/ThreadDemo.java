package com.ciq.threadjion;

public class ThreadDemo  extends Thread{
@Override
public void run() {
for(int i=0;i<=3;i++) {
	System.out.println("sahithi");
	try {
		Thread.sleep(10);
System.out.println("The current thread name is: " + Thread.currentThread().getName());  
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(i);
}
}
public static void main(String[] args) {
	ThreadDemo td=new ThreadDemo();
	Thread t1=new Thread(td);
	Thread t2=new Thread(td);
	Thread t3=new Thread(td);
	t1.start();
	try {
		System.out.println("\n"+"t1"+Thread.currentThread().getName()+"\n");
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t2.start();
	try {
		System.out.println("\n"+"t2"+Thread.currentThread().getName()+"\n");
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t3.start();
	System.out.println("\n"+"t3"+Thread.currentThread().getName()+"\n");
	
}
}
