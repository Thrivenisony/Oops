package com.ciq.examprograms;

public class prime2 {
	public static void main(String[] args) {
		
		int n=7;
		int count=0;
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
			count++;
		}
		}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
			
		}
	}
	

}
