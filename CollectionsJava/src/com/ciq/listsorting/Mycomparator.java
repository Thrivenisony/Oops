package com.ciq.listsorting;

import java.util.Comparator;

public class Mycomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=o2.toString();
		return s2.compareTo(s1);
	}

}
