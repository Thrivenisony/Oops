package com.ciq.constmt;

public class Prime {
	public static void main(String[] args) {

  int n=6;
  int m=0;
  for(int i=1;i<=n;i++) {
	  if(n%i==0) {
		  m++;
		  }
		  
	  }if(m==2) {
		  System.out.println("the give num is prime");
	  }else {
		  System.out.println("the given num is not prime");
	  }
  }

}

