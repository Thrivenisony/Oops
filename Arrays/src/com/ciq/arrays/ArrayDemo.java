package com.ciq.arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int arr[]= {10,15,24,50};
		int min=arr[0];
		for(int i=0;i<3;i++) {
			if(min>arr[i])
				min=arr[i];
		
	}
		
		System.out.println("min value:"+min);
	}

}
//int arr[]=new int [3];
//int max=arr[0];
//arr[0]=20;
//arr[1]=30;
//arr[2]=40;
//for(int i=0;i<3;i++) {
//	if(arr[i]>max)
//		max=arr[i];
//
//}
//
//System.out.println("max value:"+max);
//}
//System.out.println(a[i]);