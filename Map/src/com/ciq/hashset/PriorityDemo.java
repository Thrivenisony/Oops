package com.ciq.hashset;

import java.util.PriorityQueue;

public class PriorityDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(100);
		pq.add(15);
		pq.add(60);
		pq.add(5);
		pq.add(10);
		pq.add(150);
		pq.add(16);
		pq.add(51);
		System.out.println(pq);
	}

}
