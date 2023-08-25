package com.ciq.myimmutable;

import java.io.Serializable;

public final class MYimmutable implements CharSequence,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String name;
	public  MYimmutable(String string) {
		name=string;
		}
	public String getname() {
		return name;
		
	}
	
	public String toString() {
		return "name"+" "+name;
		
		}
		public static void main(String[] args) {
			MYimmutable immu=new MYimmutable("thriveni");
			System.out.println(immu);
		}
		@Override
		public int length() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public char charAt(int index) {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public CharSequence subSequence(int start, int end) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	
	


