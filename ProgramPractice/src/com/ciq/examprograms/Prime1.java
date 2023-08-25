package com.ciq.examprograms;

import java.util.ArrayList;
import java.util.List;

public class Prime1 {
	
	public static boolean isPrimeee(int A) {
		
		int count=0;
		for (int i = 1; i <= A; i++) {
			if(A%i==0) {
				count++;
			}
		}
		if(count==2) {
		System.out.println("prime number");
			return true;
		}else {
			System.out.println("is not prime number");
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for (int i : a) {
			if(isPrimeee(i)) {
				System.out.println(i);
	}
		}
	}
	}
//		 List<Integer> numbers = new ArrayList<>();
//	        numbers.add(15);
//	        numbers.add(7);
//		
//	        for (Integer integer : numbers) {
//	        	if(isPrimeee(integer)) {
////					System.out.println(integer);
//				}
//			}
	        
	//}
	
	//}