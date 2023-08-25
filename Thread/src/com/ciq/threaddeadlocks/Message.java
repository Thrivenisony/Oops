package com.ciq.threaddeadlocks;

public class Message {
	private String message;
	private boolean empty=true;
	 public String read() {
		 while(empty) {
			 empty=true;
			 
		 }
		return message;
	 }
	 public void write(String message) {
		 while(!empty) {
			 
			 }
		 empty=false;
		 this.message=message;
		 
	 }
	

}
