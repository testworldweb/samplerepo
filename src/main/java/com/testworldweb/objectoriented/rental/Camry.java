package com.testworldweb.objectoriented.rental;

public class Camry extends Car {
//if case class gets constructor , then its mandatory for the derived class to define it as well
	public Camry() {
		super(4, ModelType.FULLSIZE);
		
	}

	public void start() {
	System.out.println("starting Camry. Checking all "+doors+" doors are  closed");
		
	}

	public void acellerate() {
		System.out.println("Accellerating 30 mph");
		
	}


}
