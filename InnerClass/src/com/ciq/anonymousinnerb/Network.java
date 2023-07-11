package com.ciq.anonymousinnerb;

public interface Network {
	
	public abstract void Airtel();
	public abstract void Jio();

	
	
	public static void main(String[] args) {
		Network nw=new Network() {
			
			@Override
			public void Jio() {
				System.out.println("jio");
				
			}
			
			@Override
			public void Airtel() {
				System.out.println("Airtel");
				
			}
		};
		nw.Airtel();
		nw.Jio();
	}
}
