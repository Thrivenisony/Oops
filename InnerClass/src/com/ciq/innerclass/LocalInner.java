package com.ciq.innerclass;

public class LocalInner {
   int b=10;
   void localinner() {
	   System.out.println("local inner class");
	   System.out.println(b);
	   class local{
		   int a=10;
		   void local() {
			   System.out.println("local inner");
			   System.out.println(a);
		   }
	   }
	   
	   local l=new local();
	   l.local();
   }
   public static void main(String[] args) {
	LocalInner li=new LocalInner();
	li.localinner();
}
   
   
}
