package com.ciq.InnerClass;

public class Outer {
	private int id;
	private String name;

	public int getid() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	

//	public void getdata() {
//		System.out.println("outer id" + id);
//		System.out.println("outer name" + name);
//	}

	public class InnerClass {
		private String Color;

		public String getColor() {
			return Color;
		}

		public void setColor(String Color) {
			this.Color = Color;
		}

		public void getcolor() {
			System.out.println("color name:" + Color);
			System.out.println("outer id" + id);
			System.out.println("outer name" + name);
					}

		

	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.InnerClass innerref = outer.new InnerClass();
		outer.setId(20);
		outer.setname("ramu");
		//outer.getdata();

		innerref.setColor("green");
		innerref.getcolor();
		

	}
}