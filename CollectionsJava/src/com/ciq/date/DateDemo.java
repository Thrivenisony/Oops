package com.ciq.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println("Date:"+date);
		
//		Date d1-new Date(2000, 10, 10);
//		System.out.println(d1);
		
		//this String converted into java.util.date
		
		String date2="29-04-1994";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date  date4=sdf.parse(date2);
		System.out.println("Date:"+" "+date4);
		System.out.println("***********************");
		
		//java.util.date converted into String type
		
		
		SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yy");
		String d5=sdf2.format(date);
		System.out.println("Date:"+d5);
		System.out.println("*********************");
		
		SimpleDateFormat sdf3=new SimpleDateFormat("dd-MM-yyyy");
		String d6=sdf3.format(date);
		System.out.println("Date:"+d6);
		System.out.println("*************************");
		
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-yyyy");
		String d9=sdf1.format(date);
		System.out.println("Date:"+d9);
		
		System.out.println("*******************");
		SimpleDateFormat sdf4=new SimpleDateFormat("dd/MMMM/yyyy");
		
		String d7=sdf4.format(date);
		System.out.println("Date:"+d7);
		
		System.out.println("****************");
		SimpleDateFormat sdf6=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String d8=sdf6.format(date);
		System.out.println("Date:"+d8);
		
		
		
	}

}
