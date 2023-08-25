package com.ciq.constmt;

public class Primeornot {

	public static void main(String[] args) {
		int n=1;
		int m=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				m++;
			}}if(m==2) {
				System.out.println(n+"is a prime number");
			}else {
				System.out.println(n+"is not a prime number");
			}
		

	}

}
