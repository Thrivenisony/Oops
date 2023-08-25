package com.ciq.arrays;

public class Evenodd {
	public static void main(String[] args) {
		int arr[]= {10,15,24,50,3,7};
		System.out.println("odd Numbers");
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2!=0) {
				 System.out.println(arr[i]);
			 }
		 }
		
		 System.out.println("Even Numbers");
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 System.out.println(arr[i]);
			 }
		 }
		
		
	}
	
}
