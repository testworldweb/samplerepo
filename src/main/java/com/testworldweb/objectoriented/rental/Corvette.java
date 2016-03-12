package com.testworldweb.objectoriented.rental;

public class Corvette extends Car
{

	public Corvette() {
		super(2, ModelType.SPORTS);
		// TODO Auto-generated constructor stub
	}

	public void start() {
	System.out.println("starting Corvette. Checking all "+doors+" doors are  closed");
		
	}

	public void acellerate() {
		System.out.println("Accellerating 100 mph");
		
	}
		


}
