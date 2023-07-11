package com.ciq.hashset;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<Integer> num=new Stack<>();
	num.add(15);
	num.add(60);
	num.add(45);
	num.add(65);
	System.out.println(num);
	
	System.out.println(num.peek());
	System.out.println(num);
	System.out.println(num.pop());
	System.out.println(num);
	System.out.println(num.push(25));
	System.out.println(num);
	System.out.println(num.isEmpty());
	System.out.println(num);
	num.clear();
	System.out.println(num.isEmpty());
}
}
