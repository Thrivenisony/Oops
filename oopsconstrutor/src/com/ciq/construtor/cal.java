package com.ciq.construtor;


public class cal {
	
	
	
  public int sum(int a, int b) {
	return a+b;
}
  public double sum(double a,double b) {
	return a+b;
	}
  public float sum(float a,float b){
	return a+b;
}
  public long sum(long a,long b) {
	  return a+b;
  }
  public static void main(String[] args) {
	  cal cal=new cal();
	  System.out.println(cal.sum(10,20));
	  System.out.println(cal.sum(20.05, 30.10));
	  System.out.println(cal.sum(20.5,10.5));
	  System.out.println(cal.sum(100000, 200000));
  }
}
