package com.ciq.Innerclasses;

import com.ciq.Innerclasses.Outer.Inner;

public class Test {

	public static void main(String[] args) {
		// member inner class
		Outer outer=new Outer();
		outer.outermethod();
		
		Outer.Inner inner=outer.new Inner();
	inner.innermethod();
//		
//		//local inner class
//		
//		LocalOuter lo=new LocalOuter();
//		lo.outer();
//		
//		StaticOuter.staticinner ref=new StaticOuter.staticinner();
//		ref.staticinnermethod();
		
	}
	
}
