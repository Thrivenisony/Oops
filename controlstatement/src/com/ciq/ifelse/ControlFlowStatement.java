package com.ciq.ifelse;

public class ControlFlowStatement {
public static void main(String[] args) {
	int a=200;
	int b=100;
	int c=1000;
	//if(a>b) {
		//System.out.println("a is big");
		//}
	//else {
		//System.out.println("b is big");
	
   if((a>b) &&(a>c)) {
	System.out.println("a is big");
   }
   else if((b>a)&&(b>c)) {
	   System.out.println("b is big");
   }
   else {
	   System.out.println("c is big");
   }
	
}
}
