package com.ciq.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lists1 {
	
	
	ArrayList<Integer> list;

    public Lists1(int n){

        list = new ArrayList<Integer>();

        preparePrimeList(n);
    }

    private void preparePrimeList(int n){
        int c =0;
        for (int i=0; i<=n; i++) {

            if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
                list.add(i);
                c++;
            }
        }

        list.remove(0);
        list.remove(1);
        
    }
    public void printPrimeList(){
        System.out.println(list);
    }
    public boolean isPrime(int nbr){

            if (list.contains(nbr)) {
                return true;
        }
        return false;
    }
	
	
	
	
	public static void main(String[] args) {
		
		Lists1 primes=new Lists1(10);
        primes.printPrimeList();
        primes.isPrime(33);
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> list=new ArrayList();
//		list.add(500);
//		list.add(20);
//		list.add(30);
//		list.add(100);
//		list.add(20);
//		list.add(30);
//		list.add(100);
//		System.out.println("max value:"+Collections.max(list));
//		System.out.println("min value:"+Collections.min(list));
		
//		Iterator iterator=list.iterator();
		
		
		
		
		
		
		
		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//
//			if(list % 2==0) {
//				
//			}
//		}
		
		
		
		
		
		
		
		 
//		int sum=0;
//		for (Integer integer : list) {
//			Integer value=integer;
//			sum=sum+value;
//		}
//		System.out.println(sum);
//	}
//}
//		int sum=0;
//		for (Integer integer : list) {
//			Integer value=(Integer) integer;
//			sum=sum+value;
//		}
 //}

//}
//list.set(1, "Advance");
//System.out.println(list);
//list.add("java");
//list.add("c");
//list.add("python");
////System.out.println(list);
//System.out.println(list.contains("c"));
//System.out.println();
//List list2=new ArrayList();
//list2.add("Adhithya");
//list2.add("Thriveni");
//list2.add("sony");
//System.out.println(list2.containsAll(list));