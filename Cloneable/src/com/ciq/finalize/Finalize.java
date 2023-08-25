package com.ciq.finalize;

public class Finalize {
	int i;
	public Finalize() {
		
	}
	public Finalize(int i) {
		this.i=i;
	}
	@Override
	protected void finalize() throws Throwable {
		
		
		System.out.println("**************************");
	}
	public static void main(String[] args) {
	
		for(int i=0;i<=10000;i++)
		{
			System.out.println((i));
		}

	}

}
