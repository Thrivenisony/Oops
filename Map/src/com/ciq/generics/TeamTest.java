package com.ciq.generics;

import java.util.List;
import java.util.ArrayList;

public class TeamTest<T extends Players> {
	private List<T> players=new ArrayList<>();
	 public void add(T e) {
		 players.add(e);
	 }
	public List<T> getAllPlayers(){
		return players;
	}
	
	
	public static void main(String[] args) {
		TeamTest<CricketPlayers> tt=new TeamTest<>();
		 CricketPlayers cp1=new CricketPlayers(1, "Mahendra Singh", "Dhoni", 1981, "Cricket Player", 7, 100);
		 CricketPlayers cp2=new CricketPlayers(2, "Sachin", "Tendulkar", 1973, "Cricket Player", 10, 100);
		 CricketPlayers cp3=new CricketPlayers(3, "Virat", "Kohli", 1988, "Cricket Player", 18, 100);
		 CricketPlayers cp4=new CricketPlayers(4, "Mahendra Singh", "Dhoni", 1981, "Cricket Player", 7, 100);
	
	     FootBallPlayer fbp1=new FootBallPlayer(1, "Lionel", "Messi", 1987, "Forward", 802, 42);
	     FootBallPlayer fbp2=new FootBallPlayer(2, "Cristiano", "Ronaldo", 1985, "Forward", 819, 34);
         FootBallPlayer fbp3=new FootBallPlayer(3, "Alfredo di", "Stefano", 1971, "Forward", 507, 27);
	     FootBallPlayer fbp4=new FootBallPlayer(4, "Gerd", "Muller", 1945, "Forward", 718, 16);

	tt.add(cp1);
	tt.add(cp2);
	tt.add(cp3);
	tt.add(cp4);
	List<CricketPlayers> allplayers=tt.getAllPlayers();
	allplayers.forEach(System.out::println);
	
	
	}
	
	
	

}
