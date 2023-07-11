package com.ciq.generics;

public class CricketPlayers extends Players{
	
	private String typeOfPlayer;
	private int jerseyNumbers;
	private int runRate;
	
	
	

	@Override
	public String toString() {
		return "CricketPlayers [typeOfPlayer=" + typeOfPlayer + ", jerseyNumbers=" + jerseyNumbers + ", runRate="
				+ runRate + "]";
	}




	public CricketPlayers(int id, String firstName, String lastName, int year,String typeOfPlayer,int jerseyNumbers,int runRate) {
		super(id, firstName, lastName, year);
		this.typeOfPlayer=typeOfPlayer;
		this.jerseyNumbers=jerseyNumbers;
		this.runRate=runRate;
		
		
	}




	



	

	
		
	}


