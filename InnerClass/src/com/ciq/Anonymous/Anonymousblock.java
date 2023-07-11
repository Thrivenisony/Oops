package com.ciq.Anonymous;

public class Anonymousblock {


	public static void main(String[] args) {
		
		Myinerface i=new Myinerface() {
			
			@Override
			public void sum() {

				System.out.println("anonymous class");
			}
		};
		
		i.sum();
		
	}
	
	
}
