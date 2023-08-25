package com.ciq.threaddeadlocks;

public class Read implements Runnable{
	private Message message;
	

	public Read(Message message) {
		
		this.message = message;
	}

         
	
	@Override
	public void run() {
		for(String lmessage=message.read();!lmessage.equals("Finished!");lmessage=message.read())
		System.out.println(lmessage);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
