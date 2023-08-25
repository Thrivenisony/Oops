package com.ciq.finalize;

public class Finalizee {
	int i;
	public Finalizee(int i) {
		this.i=i;
	}
	@Override
	protected void finalize() throws Throwable {
	System.out.println("**************************");	
	}
public static void main(String[] args) {
	Finalize Fin=new Finalize();
	for(int i=1;i<=1000000000;i++) {
		System.out.println("the i value is"+(i));
	}
	
	
}
}
