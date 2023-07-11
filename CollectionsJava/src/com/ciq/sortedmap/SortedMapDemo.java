package com.ciq.sortedmap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> mapHttpStatus=new TreeMap<Integer, String>();
		mapHttpStatus.put(100,"Continue");
		mapHttpStatus.put(200,"Ok");
		mapHttpStatus.put(300,"Multiple Chioces");
		mapHttpStatus.put(250,"Bad Request");
		mapHttpStatus.put(401,"Unauthorized");
		mapHttpStatus.put(402,"Payment Required");
		mapHttpStatus.put(403,"Forbidden");
		mapHttpStatus.put(404,"Not Found");
		mapHttpStatus.put(500,"Internal Server Error");
		mapHttpStatus.put(501,"Not Implemented");
		mapHttpStatus.put(502,"Bad Gateway");
		//System.out.println("All key value pairs:"+mapHttpStatus);
		for(Integer code:mapHttpStatus.keySet()) {
			System.out.println(code+" -> "+mapHttpStatus.get(code));
		}
		Integer firstKey=mapHttpStatus.firstKey();
		String firstValue=mapHttpStatus.get(firstKey);
		
		System.out.println("First status:"+firstKey+"->"+firstValue);
		
		System.out.println("*********************");
		
		Integer lastkey=mapHttpStatus.lastKey();
		String lastValue=mapHttpStatus.get(lastkey);
		System.out.println("Last status:"+lastkey+"->"+lastValue);
		
		System.out.println("****************************");
		
		
		SortedMap<Integer, String> mapStatus=mapHttpStatus.subMap(400, 500);
		for(Integer code1:mapStatus.keySet()) {
			System.out.println(code1+"->"+mapStatus.get(code1));
		}
		
		
		System.out.println("*********************");
		
		SortedMap<Integer, String> mapUnder300Status=mapHttpStatus.headMap(300);
		for(Integer code:mapUnder300Status.keySet()) {
			System.out.println(code+"->"+mapUnder300Status.get(code));
		}
		
		System.out.println("***************************");
		SortedMap<Integer, String> mapAbove500Status=mapHttpStatus.tailMap(500);
		 
		for(Integer code:mapAbove500Status.keySet()) {
			System.out.println(code+"->"+mapAbove500Status.get(code));
		}
		System.out.println("************************");
		Comparator comparator=mapHttpStatus.comparator();
		System.out.println("Sorted by natural ordering?"+(comparator==null));
	
		System.out.println("****************************");
		SortedMap<Integer, String> httpStatusCodes=new TreeMap<Integer, String>(new ReverseComparator());
		httpStatusCodes.put(100,"Continue");
		httpStatusCodes.put(200,"Ok");
		httpStatusCodes.put(300,"Multiple Chioces");
		httpStatusCodes.put(250,"Bad Request");
		httpStatusCodes.put(401,"Unauthorized");
		httpStatusCodes.put(402,"Payment Required");
		httpStatusCodes.put(403,"Forbidden");
		httpStatusCodes.put(404,"Not Found");
		httpStatusCodes.put(500,"Internal Server Error");
		httpStatusCodes.put(501,"Not Implemented");
		httpStatusCodes.put(502,"Bad Gateway");
	
				for(Integer code:httpStatusCodes.keySet()) {
					System.out.println(code+"->"+httpStatusCodes.get(code));
				}
	}

}
