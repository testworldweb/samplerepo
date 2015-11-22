package com.testworldweb.java.basics.inheritance.constructors;

public class Bird {
	
	int noOfWings;
	String featherColor;
	int flyspeed;
	//default constructor removed when you define this 
	Bird(int noOfWings,String featherColor,int flyspeed)
	{
	this.noOfWings=noOfWings;
	this.featherColor=featherColor;
	this.flyspeed=flyspeed;
	
	}
	public void fly()
	{
		System.out.println("Flying at "+flyspeed + " using "+ noOfWings);
	}

	


}
