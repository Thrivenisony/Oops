package com.ciq.arrays;

public class ArrayDemo3 {
public static void main(String[] args) {
	int numbers[]= {80,90,70,50,40};
	int elementToSearch=50;
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]==elementToSearch) {
			System.out.println(numbers[i]);
		}
	}
	String[] Namefruits= {"apple","bananna","mango","grapes"};
	String ToSearch="mango";
	for(int i=0;i<Namefruits.length;i++) {
		if(Namefruits[i]==ToSearch) {
			System.out.println(Namefruits[i]);
		}
	
		
	}
	double[] id= {01,02,03,04,05};
	double SearchId=04;
	for(int i=0;i<id.length;i++) {
		if(id[i]==SearchId) {
			System.out.println(Math.round(id[i]));
			
		}
	}
	
	}
	
}
