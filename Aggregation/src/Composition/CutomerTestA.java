package Composition;

import java.util.Arrays;

public class CutomerTestA {
	public static void main(String[] args) {
		AddressA ad=new AddressA(1,"hnk","ts");
		AddressA ad1=new AddressA(2,"hyd","ts");
		AddressA ad2=new AddressA(3,"bhpl","ts");
		AddressA[] ad3= {ad,ad1,ad2};
		CustomerA c=new CustomerA(1,"thriveni", ad3);
		System.out.println(c);
		
		if(c.getAddressa()!=null)  {
			
			System.out.println(Arrays.toString(c.getAddressa()));			
			
		}
		
		
	}

}
