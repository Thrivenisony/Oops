package com.ciq.tostring;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Customer c1=new Customer(1,"zzz","ehsj","Warangal",20000);
		//System.out.println(c1);
		Customer c2=new Customer(3,"Thirunagiri","Naresh","Nalgonda",30000);
		//System.out.println(c2);
		Customer c3=new Customer(2,"Adithya","Thirunagiri","hyderabad",40000);
		//System.out.println(c3);
        Customer c4=new Customer(4,"shekhar","defgjd","ghanpur",50000);	
        //System.out.println(c4);
		Customer[] cu= {c1,c2,c3,c4};
		Arrays.sort(cu);
		//System.out.println(Arrays.toString(customer));
		for (Customer bb : cu) {
			System.out.println(bb);
			
		}
		
		
		
	}

}
