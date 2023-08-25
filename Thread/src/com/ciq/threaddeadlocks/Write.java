package com.ciq.threaddeadlocks;

public class Write  implements Runnable{
	private Message message;
	public Write(Message message) {
		this.message=message;
		
		
	}

	@Override
	public void run() {
	String messages[]= {"humpty dumpty set on a wall"};
	for(int i=0;i<messages.length;i++) {
		message.write(messages[i]);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	message.write("Finished!");
		
	}
	

}
