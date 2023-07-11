package com.ciq.navigableset;

import java.util.TreeMap;




public class NavigableMap {
	public static void main(String[] args) {
	TreeMap<String, String> treemap=new TreeMap<>();
    treemap.put("b","banana");
    treemap.put("a","apple");
    treemap.put("o","orange");
    treemap.put("g","grapes");
    treemap.put("m","mango");
    treemap.put("p", "pineapple");
    treemap.put("t", "tree");
    System.out.println(treemap);
    System.out.println(treemap.ceilingKey("o"));//o
    System.out.println(treemap.higherKey("o"));//p
    System.out.println(treemap.floorKey("m"));//m
    System.out.println(treemap.pollFirstEntry());
    System.out.println(treemap.lowerKey("b"));//null
    System.out.println(treemap.pollLastEntry());
   
    System.out.println(treemap);
	}

}
