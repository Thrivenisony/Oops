package com.ciq.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prime {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(15);

	        int index = 0; 

	        int number = numbers.get(index);
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	    private void syso() {
			System.out.println("dfghjk");
		}

	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	        
	    }
	}





