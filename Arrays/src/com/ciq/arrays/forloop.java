package com.ciq.arrays;
//internal for loop
//if we have a for loop inside the another loop
public class forloop {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++ ) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		
}
}

