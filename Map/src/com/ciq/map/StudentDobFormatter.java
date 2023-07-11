package com.ciq.map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDobFormatter {
	private static final SimpleDateFormat simpleDateForemat=new SimpleDateFormat("mm/dd/yyyy");
	
   public static String getDateMMDDYYYY(Date date) {
	   return simpleDateForemat.format(date);
	   
   }
   public static Date getDateMMDDYYYY(String date) {
	   try {
		return simpleDateForemat.parse(date);
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	return null;
	   
   }
}
