package com.ciq.generics;

public abstract class Players {
	private int id;
	private String firstName;
	private String lastName;
	private int year;
	
	public Players(int id,String firstName,String lastName,int year) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.year=year;
		
		}
	public int getID() {
     return id;
	
	}
	
	public void setID(int id) {
		this.id=id;
		
	}
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
   public void setlastName(String lastName) {
	   this.lastName=lastName;
   }
   public int getyear() {
	   return year;
   }
   public void setyear(int year) {
	   this.year=year;
   }
@Override
public String toString() {
	
	return "Player[id="+ id +", firstName="+ firstName +", lastName="+ lastName+ ", year="+ year+"]";
	
}
   
}

