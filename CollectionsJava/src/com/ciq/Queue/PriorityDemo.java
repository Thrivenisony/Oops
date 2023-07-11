package com.ciq.Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());
		q.add(10);
		q.add(20);
		q.add(5);
		q.offer(25);
		q.offer(30);
		System.out.println(q);
		// while(!q.isEmpty())
		// System.out.println(q.poll());
//		for (Integer integer : q) {
//			System.out.println(integer);
//		}
		// q.clear();
		// System.out.println(q);
//		System.out.println(q);
		System.out.println(q.contains(5));
		System.out.println(q);
//
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
		// System.out.println(q.remove());

		// System.out.println(q);

	}

}
