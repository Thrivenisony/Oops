package com.ciq.navigableset;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> httpStatusCodes=new TreeMap<>();
		httpStatusCodes.put("100", "Continue");
		httpStatusCodes.put("200", "Ok");
		httpStatusCodes.put("303", "See Others");
		httpStatusCodes.put("300", "Multiple Choices");
		httpStatusCodes.put("404", "Not Found");
		httpStatusCodes.put("500", "Internal Server");
		httpStatusCodes.put("400", "Bad Request");
		httpStatusCodes.put("401", "Unauthorized");
		httpStatusCodes.put("402", "Payament Required");
		httpStatusCodes.put("403", "Forbidden");
		httpStatusCodes.put("501", "Not Implemented");
		httpStatusCodes.put("502", "Bad Gateway");
		System.out.println(httpStatusCodes);
		//System.out.println(httpStatusCodes.descendingKeySet());
	NavigableMap<String, String> descendingKeySetNav=httpStatusCodes.descendingMap();
	for(String httpStatusCode:descendingKeySetNav.keySet()) {
		System.out.println("HTTPSTATUSCODE"+" "+httpStatusCode+"   "+descendingKeySetNav.get(httpStatusCode));
	}
	System.out.println("***************************");
		Set<String> ascendingKey=httpStatusCodes.keySet();
		System.out.println("Ascending Keys:"+ascendingKey);
		
		System.out.println("***************************");
		
		Set<String> descendingKey=httpStatusCodes.descendingKeySet();
		System.out.println("Descending key:"+ descendingKey);
		
		System.out.println("**************************");
		
		String lowerKey=httpStatusCodes.lowerKey("401");
		System.out.println("Lower Key:"+lowerKey);
		
		System.out.println("**************************");
		
		String floorKey=httpStatusCodes.floorKey("500");
		System.out.println("Floor Key:"+floorKey);
		
		System.out.println("**************************");
		
		String higherKey=httpStatusCodes.higherKey("403");
		System.out.println("Higher Key:"+higherKey);
		
		System.out.println("**************************");
		
		String ceilingKey=httpStatusCodes.ceilingKey("200");
		System.out.println("Ceiling Key:"+ceilingKey);
		
		System.out.println("**************************");
		
		Map.Entry<String, String> firstEntry=httpStatusCodes.firstEntry();
		System.out.println("First entry:"+firstEntry.getKey()+"=>"+firstEntry.getValue());
		
System.out.println("**************************");
		
		Map.Entry<String, String> lastEntry=httpStatusCodes.lastEntry();
		System.out.println("Last entry:"+lastEntry.getKey()+"=>"+lastEntry.getValue());
System.out.println("**************************");
		
		Map.Entry<String, String> lowerEntry=httpStatusCodes.lowerEntry("401");
		System.out.println("Lower entry:"+lowerEntry.getKey()+"=>"+lowerEntry.getValue());
System.out.println("**************************");
		
		Map.Entry<String, String> floorEntry=httpStatusCodes.floorEntry("400");
		System.out.println("Floor entry:"+floorEntry.getKey()+"=>"+floorEntry.getValue());
		
System.out.println("**************************");
		
		Map.Entry<String, String> higherEntry=httpStatusCodes.higherEntry("300");
		System.out.println("Higher entry:"+higherEntry.getKey()+"=>"+higherEntry.getValue());
	
		System.out.println("*******************************");
		
		Map.Entry<String, String> ceilingEntry=httpStatusCodes.ceilingEntry("200");
		System.out.println("Ceiling Entry"+ceilingEntry.getKey()+"=>"+ceilingEntry.getValue());
		
		httpStatusCodes.pollFirstEntry();
		httpStatusCodes.pollLastEntry();
		
		//System.out.println(httpStatusCodes);
		
		for(String key:httpStatusCodes.keySet()) {
			System.out.println(key+" =>"+httpStatusCodes.get(key));
		}
		
	}

}
