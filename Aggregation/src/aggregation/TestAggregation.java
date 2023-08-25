package aggregation;

import java.util.Arrays;

public class TestAggregation {
	public static void main(String[] args) {
		Address ad=new Address(1,"hnk","ts");
		Address ad1=new Address(2,"hyd","ts");
		Address ad2=new Address(3,"wgl","ts");
		Address[] adrs= {ad,ad1,ad2};
		person ps=new person(1, "thriverni", 50000,adrs);
		System.out.println(ps);
		if(ps.getAddress()!=null) {
			System.out.println(Arrays.toString(ps.getAddress()));
		}
	}

}
