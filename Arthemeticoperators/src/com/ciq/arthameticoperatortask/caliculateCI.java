package com.ciq.arthameticoperatortask;

public class caliculateCI {
public static void main(String[] args) {
	double principleAmount=10000;
	double time=12;
	double intrestRation=3.00; 
	float simpleintrest=(float) ((principleAmount*time*intrestRation)/100);
	System.out.println("simpleintrest value:"+Math.round(simpleintrest));
	System.out.println("total amount si:"+ Math.round(principleAmount+simpleintrest));
	double ci=principleAmount*Math.pow((1+intrestRation/100),time);
	System.out.println("compund intrest:"+ Math.round(ci));
	
}
}
