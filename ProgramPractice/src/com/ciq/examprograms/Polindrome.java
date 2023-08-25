package com.ciq.examprograms;

public class Polindrome {

	public static void main(String[] args) {
		int num=101;
		int reversenumber=0;
		int original=num;
		int temp;
		while(num>0) {
			temp=num%10;
			reversenumber=(reversenumber*10)+temp;
			num=num/10;
		}
  if(original==reversenumber) {
	System.out.println("it is polindrome");
}else {
	System.out.println("not polindrome");
}
	}

}
