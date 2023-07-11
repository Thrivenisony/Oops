package com.ciq.prioritydemo;

import java.util.PriorityQueue;

public class PriorityDemo2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> num=new PriorityQueue<>();
		num.add(100);
		num.add(200);
		num.add(50);
		num.add(60);
		num.add(70);
		//num.add(null);
		System.out.println(num);
	}

}
