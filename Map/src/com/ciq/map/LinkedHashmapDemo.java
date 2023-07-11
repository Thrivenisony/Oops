package com.ciq.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmapDemo {
public static void main(String[] args) {
	HashMap<String, Double> lm=new HashMap<>();
	lm.put("mango", 100.00);
	lm.put("Apple", 150.00);
	lm.put("Orange", 200.00);
	lm.put("kiwi", 180.00);
	
	HashMap<String, Double> lm2=new HashMap<>(lm);
	lm2.put("aaa", 100.00);
	lm2.put("bbb", 150.00);
	lm2.put("ccc", 200.00);
	lm2.put("ddd", 180.00);
	
	HashMap<HashMap<String, Double>, HashMap<String, Double>> sc=new HashMap<HashMap<String,Double>, HashMap<String,Double>>();
	sc.put(lm,lm2);
	System.out.println(sc);
	System.out.println("***************************");
	System.out.println(lm2);
//	System.out.println(lm2);
	
//	HashMap<HashMap<String, Double>, HashMap<String, Double>> hs=new HashMap<>();
//	hs.put(lm, lm2);
//	Iterator<Entry<HashMap<String, Double>, HashMap<String, Double>>> ii= hs.entrySet().iterator();
//	while(ii.hasNext()) {
//		System.out.println(ii.next());
//	}
	
	
	

	  
//	Iterator<Entry<String, Double>> itr=lm2.entrySet().iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
}
}
