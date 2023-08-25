package com.ciq.threadjion;

public class JionMethod extends Thread{
@Override
public void run() {
for(int i=1;i<=5;i++) {
	System.out.println("run:" + Thread.currentThread().getName());
}

}
public static void main(String[] args) throws InterruptedException {
	JionMethod jm=new JionMethod();
	Thread th1=new Thread(jm);
	th1.start();
	th1.join();
	for(int i=1;i<=5;i++) {
		
		System.out.println("main:"+ Thread.currentThread().getName()+""+Thread.MAX_PRIORITY);
	}
	
	Thread th2=new Thread(jm);
	th2.start();
	//th1.join();
	System.out.println("th2 thread:"+Thread.currentThread().getName());
	
	Thread th3=new Thread(jm);
	th3.start();
	System.out.println("th3 thread:"+Thread.currentThread().getName());
	
	
	

}
}
