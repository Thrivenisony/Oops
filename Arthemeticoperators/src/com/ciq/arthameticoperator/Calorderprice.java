package com.ciq.arthameticoperator;

public class Calorderprice {
	public static void main(String[] args) {
		double mobilePrice=30000;
		System.out.println("mobile price:"+mobilePrice);
		double discount=(15%mobilePrice)*100;
		System.out.println("discount:"+discount);
		double carddiscount=(5%mobilePrice)*100;
		System.out.println("carddiscount"+carddiscount);
		double discountmobile=mobilePrice-discount-carddiscount;
		System.out.println("discount mobile:"+discountmobile);
		double cgst=(2%discountmobile)*100;
		double sgst=(3%discountmobile)*100;
		System.out.println("cgst:"+cgst);
		System.out.println("sgst"+sgst);
		double mobileprice=discountmobile+cgst+sgst;
		System.out.println("mobile price:"+mobileprice);
		
		///cal ci
	
			double prinicpleAmount = 10000.00;
		
			double time = 12.00;
			double interestRation = 3.00;

			float si = (float) ((prinicpleAmount * time * interestRation) / 100);
			System.out.println("simple interest: " + si);
			System.out.println("total amount with si "+ (prinicpleAmount+si));

			double ci = prinicpleAmount * Math.pow((1 + interestRation / 100), time);
			System.out.println(ci);
			System.out.println("compound Interest: " +Math.round(ci) );

		
	}

	
}
