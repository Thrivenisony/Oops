package com.ciq.linkedlist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenOdd {
	public static void main(String[] args) {
		int[] Arry= {1,3,5,8,4,6};
		List<Integer>evenlist=new ArrayList<Integer>();
		List<Integer>oddlist=new ArrayList<Integer>();
		for(int i=0;i<Arry.length;i++) {
			if(Arry[i]%2==0) {
				evenlist.add(Arry[i]);
			}else {
				oddlist.add(Arry[i]);
			}
		}
		
		Collections.sort(evenlist);
		Collections.sort(oddlist);
		for (Integer even : evenlist) {
			System.out.println("even number is:"+even);
		}
		for (Integer odd : oddlist) {
			System.out.println("odd number is:"+odd);
		}
	}

}
