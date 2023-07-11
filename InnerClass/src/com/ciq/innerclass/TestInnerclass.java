package com.ciq.innerclass;



public class TestInnerclass {
	public static void main(String[] args) {
		MemberInnerClass mm=new MemberInnerClass();
//		mm.outerMethod2();
//		mm.outerMethod3();
	 MemberInnerClass.Inner inner=mm.new Inner();
	 inner.innerMethod();
	 inner.hhr();
	 inner.eat();
	 inner.drink();
	 
	 MemberInnerClass.outr ot=mm.new outr();
	 ot.adhi();
	 
	
		 
	}

}
