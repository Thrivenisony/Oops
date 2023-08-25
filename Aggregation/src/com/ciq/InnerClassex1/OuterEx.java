package com.ciq.InnerClassex1;

public class OuterEx {
private int id;
private String name;
public class InnerEx{
	private String course;
	public void getdata() {
	System.out.println("outer id:"+id);
	System.out.println("outer name:"+name);
	System.out.println("inner couse:"+course);
}
}
public static void main(String[] args) {
	OuterEx out=new OuterEx();
	OuterEx.InnerEx in=out.new InnerEx();
	out.id=1;
	out.name="sony";
	in.course="BCA";
	in.getdata();
	
}
}
