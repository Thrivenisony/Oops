package com.ciq.json;



public class Person {
	public static void main(String[] args) {
		Integer a=100;
		Integer ab=100;
		double d=562;
		Float f=(float) 5.6;
		char c='g';
		String s="abcd";
		boolean b=true;
		long l=50214;
		short sh=654;
		byte bt=56;
		
				
		Integer.valueOf(a);
		System.out.println(a);
		
		Double.valueOf(d);
		System.out.println(d);
		
		
		Float.valueOf(f);
		System.out.println(f);
		
		String.valueOf(s);
		System.out.println(s);
		
		Character.valueOf(c);
		System.out.println(c);
		
		Boolean.valueOf(true);
		System.out.println(b);
		
		Long.valueOf(l);
		System.out.println(l);
		
		Short.valueOf(sh);
		System.out.println(sh);
		
		Byte.valueOf(bt);
		System.out.println(bt);
		
		//Integer interger=new Integer();
		
		String valueof=String.valueOf(a);
		System.out.println(valueof);
		
		String s1="1235";
		Integer value=Integer.valueOf(s1);
		System.out.println(value);
		
		String valuesof=String.valueOf(value);
		System.out.println(valuesof);
		
		Double dd=Double.valueOf(s1);
		System.out.println(dd);
		
		Long lg=Long.valueOf(s1);
		System.out.println(lg);
		
		
 int com=a.compareTo(ab);
if(com<0) {
	System.out.println("ab is bigger than a value");
	}
else if(com>0){
		System.out.println("a is bigger than ab value");
}
else {
 System.out.println("both are equal");
}

		
		
		
		
		
		
		
	}
	


	
	
	
	

}
